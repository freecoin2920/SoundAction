package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer morningMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        morningMusic = MediaPlayer.create(this, R.raw.song);
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                morningMusic.setLooping(b);
            }
        });
    }
    public void playMusic (View v){
        morningMusic.start();

    }
    public void pauseMusic (View v){
        if(morningMusic.isPlaying())
            morningMusic.pause();

    }
}
