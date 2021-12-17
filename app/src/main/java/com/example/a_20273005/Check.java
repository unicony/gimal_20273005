package com.example.a_20273005;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Check extends AppCompatActivity {

    private TextView c_tt;
    private RadioGroup c_rg;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        c_tt = findViewById(R.id.c_tt);
        c_rg = findViewById(R.id.c_rg);


        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        //c_tt.setText(str);



    }
}
