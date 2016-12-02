package com.dimension_drone.www.myfirstapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayServusActivity extends AppCompatActivity {
    MediaPlayer player = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_servus);

        //MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivity.this,R.raw.servus);
        player.start();
    }
    public void joueSonTheatre(View v){
        //MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivity.this,R.raw.c3_theatre_servus);
        player.start();
    }
    public void joueSonForum(View v){
        //MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivity.this,R.raw.a3_forum_servus);
        player.start();
    }
    public void joueSonDomus(View v){
        //MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivity.this,R.raw.d3_domus_servus);
        player.start();
    }
    public void joueSonThermes(View v){

        //setContentView(R.layout.activity_main);
        //MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivity.this,R.raw.b3_thermes_servus);
        player.start();
    }
    /*
    protected void onStop(){
        mediaPlayer.release();
        mediaPlayer = null;
    }
    */
    public void quitter(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }
}
