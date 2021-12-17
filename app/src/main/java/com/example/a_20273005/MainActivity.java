package com.example.a_20273005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHomepage  = findViewById(R.id.btn_homepage);
        Button btncheck     = findViewById(R.id.btn_check);
        Button btnGallery   = findViewById(R.id.btn_gallery);
        Button btnFinish    = findViewById(R.id.btn_finish);


        //이벤트
        btnHomepage.setOnClickListener(btnListener);
        btncheck.setOnClickListener(btnListener);
        btnGallery.setOnClickListener(btnListener);
        btnFinish.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;


            switch (v.getId()) {
                case R.id.btn_homepage:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                    startActivity(intent);
                    break;
                case R.id.btn_check:
                    intent = new Intent(MainActivity.this , Check.class);
                    startActivity(intent);
                    break;
                case R.id.btn_gallery:
                    intent = new Intent(getApplicationContext(),FipperActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_finish:
                    intent = new Intent(getApplicationContext(),FinishActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };

}