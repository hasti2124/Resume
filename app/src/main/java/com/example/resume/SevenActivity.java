package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SevenActivity extends AppCompatActivity {

    TextView btnnext;

    EditText edtpname,edtroll,edtcname,edtlocation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        btnnext = findViewById(R.id.btnnext);
        edtpname = findViewById(R.id.edtpname);
        edtroll = findViewById(R.id.edtroll);
        edtcname = findViewById(R.id.edtcname);
        edtlocation = findViewById(R.id.edtlocation);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = edtpname.getText().toString();
                String roll = edtroll.getText().toString();
                String cname = edtcname.getText().toString();
                String location = edtlocation.getText().toString();

                if(pname.isEmpty()){
                    edtpname.setError("Please enter project name!");
                }else if(roll.isEmpty()){
                    edtroll.setError("Please enter roll!");
                }else if(cname.isEmpty()){
                    edtcname.setError("Please enter company name!");
                }else if(location.isEmpty()){
                    edtlocation.setError("Please enter your location!");
                }else {
                    Intent intent = new Intent(SevenActivity.this, EightActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}