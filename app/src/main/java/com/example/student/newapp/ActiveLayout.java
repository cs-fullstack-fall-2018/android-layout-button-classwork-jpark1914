package com.example.student.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActiveLayout extends AppCompatActivity {

    TextView textView = null;
    EditText userInput = null;
    Button button = null;
    View.OnClickListener ourOnClickListener = null;
    int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_layout);
       userInput = (EditText) findViewById(R.id.editText);
       button = (Button) findViewById(R.id.submit_btn);
       textView = (TextView) findViewById(R.id.textview);
       ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked = numTimesClicked + 1;
                String result = "\nClicked " + numTimesClicked + " times";
                textView.append(result);

            }
        };
        button.setOnClickListener(ourOnClickListener);
    }
}
