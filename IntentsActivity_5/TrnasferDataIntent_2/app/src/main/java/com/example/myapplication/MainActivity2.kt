package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //get the data from first activity and assign it ti 'i'.
        val i = intent.getStringExtra(KEY_1)

        val txtv = findViewById<TextView>(R.id.txtv)
        //then set that gotten text to the textview
        txtv.setText(i)
    }
}