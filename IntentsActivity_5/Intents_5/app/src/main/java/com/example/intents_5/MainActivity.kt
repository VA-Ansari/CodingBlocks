package com.example.intents_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        //by clicking on button we go into next activity
        btn.setOnClickListener{
            val i = Intent(this, Main2Activity::class.java)
            startActivity(i)
        }
    }
}