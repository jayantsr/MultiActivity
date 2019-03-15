package com.example.multiactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
            Intent intent = getIntent();

         String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
         int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);

        TextView textview1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);

        textview1.setText(text);
        textView2.setText("" + number);

            }
        }
