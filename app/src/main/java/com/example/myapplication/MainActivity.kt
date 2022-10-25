package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dopisany = findViewById<TextView>(R.id.dopisanytxt)
        val nadbtn = findViewById<Button>(R.id.button5)
        val dopbutton = findViewById<Button>(R.id.button3)
        val input = findViewById<EditText>(R.id.wpisany)

        dopbutton.setOnClickListener{
            dopisany.text = dopisany.text.toString() + input.text.toString()

        }
        nadbtn.setOnClickListener {
            dopisany.text = input.text.toString()
        }
    }





}