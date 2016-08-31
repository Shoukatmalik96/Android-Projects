package com.example.android.musicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public Button Play_tbn,Pause_btn,Stop_btn;
    MediaPlayer song;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pause_btn=(Button) findViewById(R.id.play);
    }
    public void Play(View view){
     if(song==null) {
         song = MediaPlayer.create(this, R.raw.song);
         song.start();
     }
    }
    public void Pause(View view){



    }
    public void Stop(View view){

    song.stop();
        song=null;

    }
}
