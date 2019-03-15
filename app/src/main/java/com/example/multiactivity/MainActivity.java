package com.example.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.multiactivity.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.multiactivity.EXTRA_NUMBER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2(){

        EditText editText1 = (EditText)findViewById(R.id.edittext1);
        String text = editText1.getText().toString();


        EditText editText2 =  (EditText)findViewById(R.id.edittext2);
        int number = Integer.parseInt(editText2.getText().toString());


        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);

    }


}
