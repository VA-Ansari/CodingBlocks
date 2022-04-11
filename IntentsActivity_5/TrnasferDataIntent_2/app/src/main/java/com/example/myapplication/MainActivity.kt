package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val KEY_1 = "Name"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener{
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra(KEY_1, "Arshad")
            startActivity(i)
        }
    }
}