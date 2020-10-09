package com.example.project1_chohss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.SplineSet;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, LoginRegisterActivity.class));
                finish();
            }

        }, 2000L);

    }
}