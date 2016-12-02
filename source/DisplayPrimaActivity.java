package com.dimension_drone.www.myfirstapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayPrimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_prima);

        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.prima);
        player.start();
    }
    public void joueSon(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.music);
        player.start();
    }
    public void joueSonTheatre(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.c2_theatre_prima);
        player.start();
    }
    public void joueSonForum(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.a2_forum_prima);
        player.start();
    }
    public void joueSonDomus(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.d2_domus_prima);
        player.start();
    }
    public void joueSonThermes(View v){

        //setContentView(R.layout.activity_main);
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivity.this,R.raw.b2_thermes_prima);
        player.start();
    }
    public void quitter(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }
}
