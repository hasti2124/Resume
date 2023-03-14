package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    EditText edtcname,edteyear,edtposition;

    TextView btnnext;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

           edtcname = findViewById(R.id.edtcname);
           edteyear = findViewById(R.id.edteyear);
            edtposition = findViewById(R.id.edtposition);


            btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String companyname = edtcname.getText().toString();
                String experienceyear = edteyear.getText().toString();
                String position = edtposition.getText().toString();


                if (companyname.isEmpty()){
                    edtcname.setError("Enter company name!");
                }else if (experienceyear.isEmpty()){
                    edteyear.setError("Enter experience year!");
                }else if (position.isEmpty()){
                    edtposition.setError("Enter Position!");
                }else{
                    Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}