package com.dimension_drone.www.myfirstapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DisplayServusActivityOld extends AppCompatActivity {
    private String TAG = "Test-LED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_servus);

        //TextView textView = new TextView(this);

        //EditText editText = (EditText) findViewById(R.id.activity_display_servus);
        //editText.setText("un grand pas pour l'enfant !");
        //Annonce d'entrée du personnage
        MediaPlayer player = new MediaPlayer();
        player=MediaPlayer.create(DisplayServusActivityOld.this,R.raw.servus);
        player.start();
    }

    public void quitter(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }
}
