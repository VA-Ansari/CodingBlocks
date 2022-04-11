package com.example.implicitintents_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textplane = findViewById<EditText>(R.id.textplane)
        val mailBtn = findViewById<Button>(R.id.mailBtn)
        val broseBtn = findViewById<Button>(R.id.broseBtn)
        val dialBtn = findViewById<Button>(R.id.dialBtn)


        mailBtn.setOnClickListener{
            val email = textplane.text.toString()

            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            //uri is because, if yu wanna send some data from one activity to another activity of another app,
            //then you can only send that data in the form of uri's, fot email opening we use mailto and so on.
            i.data = Uri.parse("mailto:$email")
            startActivity(i)
        }

        //for opening chrome, browsing.
        broseBtn.setOnClickListener{
            val browser = textplane.text.toString()

            val i = Intent()
            i.action = Intent.ACTION_VIEW

            i.data = Uri.parse("http://$browser")
            startActivity(i)
        }


        dialBtn.setOnClickListener{
            val browser = textplane.text.toString()

            val i = Intent()
            i.action = Intent.ACTION_DIAL

            i.data = Uri.parse("tel:$browser")
            startActivity(i)
        }

    }
}