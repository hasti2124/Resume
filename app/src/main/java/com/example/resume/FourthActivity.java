package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    EditText edtsname,edtpyear,edtpersentage;

    TextView btnnext;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        edtsname = findViewById(R.id.edtsname);
        edtpyear = findViewById(R.id.edtpyear);
        edtpersentage = findViewById(R.id.edtpersentage);

        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String schoolname = edtsname.getText().toString();
                String passingyear = edtpyear.getText().toString();
                String persentage = edtpersentage.getText().toString();


                if (schoolname.isEmpty()){
                    edtsname.setError("Please Enter school name");
                }else if (passingyear.isEmpty()){
                    edtpyear.setError("Please passing year");
                }else if (persentage.isEmpty()){
                    edtpersentage.setError("Please Enter persrntage");
                }else{
                    Intent intent = new Intent(FourthActivity.this,FifthActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}