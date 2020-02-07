package com.alqalamsoftware.fixbkg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView TmrTxt = findViewById(R.id.TimerTxt);

        TmrTxt.setText("1234");

    }
}
