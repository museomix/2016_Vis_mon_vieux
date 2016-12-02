package com.dimension_drone.www.myfirstapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DisplayPrimaActivityOld extends AppCompatActivity {
    private String TAG = "Test-LED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_prima);

        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.titus);
        player.start();
    }

    public void joueSon(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.music);
        player.start();
    }
    public void joueSonTheatre(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.c1_theatre_titus);
        player.start();
    }
    public void joueSonForum(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.a1_forum_titus);
        player.start();
    }
    public void joueSonDomus(View v){
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.d1_domus_titus);
        player.start();
    }
    public void joueSonThermes(View v){

        //setContentView(R.layout.activity_main);
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayPrimaActivityOld.this,R.raw.b1_thermes_titus);
        player.start();
    }
    public void quitter(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }
}
//mediaPlayer.release();