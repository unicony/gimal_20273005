package com.example.a_20273005;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;


public class FipperActivity extends AppCompatActivity {
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpper);

        flipper = findViewById(R.id.flipper);
        Button btnPrev = findViewById(R.id.btn_prev);
        Button btnNext = findViewById(R.id.btn_next);

        btnPrev.setOnClickListener(btnListener);
        btnNext.setOnClickListener(btnListener);

        flipper.setFlipInterval(500);


    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_prev:
                    //flipper.showPrevious();
                    flipper.stopFlipping();
                    Toast.makeText(getApplicationContext(),"정지",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_next:
                    //flipper.showNext();
                    flipper.startFlipping();
                    Toast.makeText(getApplicationContext(),"넘기기",Toast.LENGTH_LONG).show();
                    break;

            }
        }
    };

}