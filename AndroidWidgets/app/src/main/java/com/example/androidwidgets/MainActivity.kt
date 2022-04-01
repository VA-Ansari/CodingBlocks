package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* we looked about -
                - FontFamily
                - textAllCaps :to make all text into capital letters
                - gravity
                - drawable_left :to add an image in left of the text
                - drawable_right :to add image in right side of the text
                - textStyle
                - visibility
                - textColour
        */
        val editText = findViewById<EditText>(R.id.editText)

        //in Edit Text the only difference from Text View is, we can take text from Edit Text
        //we looked about - hint
        //                 - requestFocus :this will put the cursor the enabled EditText
        val textView1 = findViewById<TextView>(R.id.textView1)
        textView1.textSize = 32F
        
    //using CheckBox
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        //this block of code is executed when we click on the CheckBox
        checkBox.setOnCheckedChangeListener{ buttonView, isChecked ->
            Toast.makeText(this, "Item is now $isChecked", Toast.LENGTH_SHORT).show()
        }

    //RadioGroup
        val radioGrp = findViewById<RadioGroup>(R.id.radioGrp)

        //to display toast whenever we click on the radio button
        radioGrp.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
            R.id.radioButton1 ->{
                textView1.setText("RadioButton1 is Checked")
                Toast.makeText(this, "Clicked on Radio Button1", Toast.LENGTH_SHORT).show()
        }
            R.id.radioButton2 -> {
                textView1.setText("RadioButton2 is Checked")
                Toast.makeText(this, "Clicked on Radio Button2", Toast.LENGTH_SHORT).show()
        }
        }
        }

    }
}