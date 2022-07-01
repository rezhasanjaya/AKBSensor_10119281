package com.example.akbsensor.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import com.example.akbsensor.R;
/**
 Rezha Satria SP
 10119281
 IF7
 **/
public class SplashActivity extends AppCompatActivity {
    Handler handler = new Handler();

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(splash);
                finish();
            }
        },2300);
    }
}
