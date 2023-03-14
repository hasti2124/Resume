package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText edtfname,edtlname,edtemail,edtaddress,edtphone;
    TextView btnnext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnnext = findViewById(R.id.btnnext);
        edtfname = findViewById(R.id.edtfname);
        edtlname = findViewById(R.id.edtlname);
        edtemail = findViewById(R.id.edtemail);
        edtaddress = findViewById(R.id.edtaddress);
        edtphone= findViewById(R.id.edtphone);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname = edtfname.getText().toString();
                String lname = edtlname.getText().toString();
                String email = edtemail.getText().toString();
                String address = edtaddress.getText().toString();
                String phone = edtphone.getText().toString();

                if(fname.isEmpty()){
                    edtfname.setError("Enter First name !");
                }else if(lname.isEmpty()){
                    edtlname.setError("Enter Last name !");
                }else if(email.isEmpty()){
                    edtemail.setError("Enter Email !");
                }else if(address.isEmpty()){
                    edtaddress.setError("Enter Address !");
                }else if(phone.isEmpty()){
                    edtphone.setError("Enter Phone number !");
                }else {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }

            }
        });


    }
}