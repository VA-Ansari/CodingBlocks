package com.example.intents_openanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    EditText etVar1, etVar2;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we are writing this, to access them from xml file into this java readable code
        tvResult = findViewById(R.id.tvResult);
        etVar1 = findViewById(R.id.etvar1);
        etVar2 = findViewById(R.id.etVar2);
        btnAdd = findViewById(R.id.btnAdd);

        //we have to add the numbers only after clicking the button,
        //because after clicking on the button only we have to read the input digits and add them after that
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());

                int var3 = var1+var2;

                tvResult.setText(String.valueOf(var3));

                //Go to Second Activity
                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                //this result string is mapped by the var3, so that we use result in other activity
                i.putExtra("result", var3);

                startActivity(i);
            }
        });

    }
}