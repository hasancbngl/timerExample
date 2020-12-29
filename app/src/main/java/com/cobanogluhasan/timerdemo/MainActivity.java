package com.cobanogluhasan.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //insert code to be run every second 1sec=1000 milisec

                Log.i("Runnable has run",  "a second mus have passed");

                handler.postDelayed(this,3000); // instructed to run it one second later



            }
        };
        handler.post(run);
       */

       new CountDownTimer(8000,1000) {

           public void onTick(long milisecondsUntilDone) {
               //Countdown is counting down (everysecond).
               Log.i("seconds are left: ", String.valueOf(milisecondsUntilDone / 1000));

           }

           public void onFinish() {
               //that will happen when countdown is finished.!! (after 8seconds)
             Log.i("It's done","countdown is finished");

           }


       }.start();


    }
}
