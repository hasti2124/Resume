package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView resume;
    ImageView image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    resume = findViewById(R.id.resume);
    image = findViewById(R.id.image);

        Animation animation = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.animation);
        image.startAnimation(animation);

        resume.startAnimation(animation);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            finish();
        }
    },3000);

    }
}