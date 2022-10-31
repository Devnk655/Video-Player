package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class MainActivity extends AppCompatActivity {
    private PlayerView mPlayerView,mPlayerView1,mPlayerView2;
    private SimpleExoPlayer msimpleExoPlayer,simpleExoPlayer,simpleExoPlayer2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayerView = findViewById(R.id.playerview);
        mPlayerView1 = findViewById(R.id.playerview1);
        mPlayerView2 = findViewById(R.id.playerview2);
        msimpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        simpleExoPlayer2 = new SimpleExoPlayer.Builder(this).build();
        mPlayerView.setPlayer(msimpleExoPlayer);
        MediaItem mediaItem = MediaItem.fromUri("https://joy.videvo.net/videvo_files/video/free/2021-04/large_watermarked/210329_06B_Bali_1080p_013_preview.mp4");
        msimpleExoPlayer.addMediaItem(mediaItem);
        msimpleExoPlayer.prepare();
        msimpleExoPlayer.play();
        mPlayerView1.setPlayer(simpleExoPlayer);
        MediaItem secondItm = MediaItem.fromUri("https://media.istockphoto.com/id/936990714/video/birds.mp4?s=mp4-640x640-is&k=20&c=6P6coDMTg4guBJ-sc3jK6cGHStuLNDkDF49bSe-R-6w=");
        simpleExoPlayer.addMediaItem(secondItm);
        simpleExoPlayer.prepare();
        simpleExoPlayer.play();
        mPlayerView2.setPlayer(simpleExoPlayer);
        MediaItem fourthItm = MediaItem.fromUri("https://media.istockphoto.com/id/936990714/video/birds.mp4?s=mp4-640x640-is&k=20&c=6P6coDMTg4guBJ-sc3jK6cGHStuLNDkDF49bSe-R-6w=");
        simpleExoPlayer2.addMediaItem(fourthItm);
        simpleExoPlayer2.prepare();
        simpleExoPlayer2.play();
    }
}