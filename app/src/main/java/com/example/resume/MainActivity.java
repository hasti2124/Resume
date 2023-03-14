package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnstart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.btnstart);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtsubmit = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(txtsubmit);
            }
        });
    }
}