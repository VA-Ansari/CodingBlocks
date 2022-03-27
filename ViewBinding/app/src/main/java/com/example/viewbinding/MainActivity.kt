package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Method1
        //created a variable of that view like this, so by this we can find our Views
        val textView = findViewById<TextView>(R.id.textView);
        textView.text = "10"
        //Method2
        //by synthetic binding we can import the View, so we don't have to write the entire Method1 code
        textView.textSize = 22f
        //using Scope, instead of using tView.text, by this we can directly access
        with(textView) {
            textSize = 22f
        }
        //or
        textView.apply {
            textSize = 22f
            isVisible = false
        }

        //now let us bind editText.
        val editText = findViewById<EditText>(R.id.editText);

        editText.setText("Arshad Ansari")

        //using apply function
        editText.apply {
            hint = "Enter your name"
            setText("Arshad Ansari")
            addTextChangedListener {
                Log.i("ViewBinding", it.toString())
            }
        }

        //now its for button
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            Toast.makeText(it.context, "First function Button Pressed", Toast.LENGTH_LONG).show()
        }

        //we have another function also which takes an Argument
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //do some actions here like Toasts
            }
        })

        btn.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

//    fun showToast(view: View) {
//        Toast.makeText(view.context, "Button Pressed", Toast.LENGTH_LONG).show()
//    }
}