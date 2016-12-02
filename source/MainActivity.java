package com.dimension_drone.www.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.DataOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.dimension_drone.www.myfirstapp.MESSAGE";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Called when the user clicks the Send button
     */
    public void tourTitus(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayTitusActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void tourPrima(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayPrimaActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void tourServus(View view) {
        Intent intent = new Intent(this, DisplayServusActivity.class);
        startActivity(intent);
    }

    public void runThreadLed(View view) {//startActivity(LedThread);
        new Thread(new Runnable() {
            public void run() {

                try {
                    Runtime command = Runtime.getRuntime();
                    Process proc;
                    DataOutputStream opt;
                    proc = command.exec("su");

                    opt = new DataOutputStream(proc.getOutputStream());
                    //Log.d(TAG, "LED Testing start.");
                    int alpha = 500;
                    while (true) {
                        LEDRun(opt, alpha);
                    }

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void LEDRun(DataOutputStream opt,int alpha) {
        try {
            opt.writeBytes("echo 3000 > /sys/bus/platform/devices/reg-81x-cs-gpio0ldo/max_microvolts\n");
            opt.writeBytes("echo 3000 > /sys/bus/platform/devices/reg-81x-cs-gpio1ldo/max_microvolts\n");
//          Log.d(TAG, "LED ON.");
            Thread.sleep(500);

            opt.writeBytes("echo 0 > /sys/bus/platform/devices/reg-81x-cs-gpio0ldo/max_microvolts\n");
            opt.writeBytes("echo 0 > /sys/bus/platform/devices/reg-81x-cs-gpio1ldo/max_microvolts\n");
//          Log.d(TAG, "LED OFF.");
            Thread.sleep(500);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void quitter(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }

}
