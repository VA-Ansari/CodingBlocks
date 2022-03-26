package com.example.intents_openanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = findViewById(R.id.textView2);

        //we created new intent, by using this only we are going to get the value from main activity
        Intent intentThatStartedThis = getIntent();

        //by this we can get the var3 which is mapped by string result, by entering in parameter
        int result = intentThatStartedThis.getIntExtra("result", 0);

        //them we assign this value we got from main activity to the text view
        textView2.setText(String.valueOf(result));
    }
}