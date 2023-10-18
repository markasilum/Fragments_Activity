package com.example.fragments_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inputs)
        val btnBack: Button
        btnBack = findViewById(R.id.button9)
        btnBack.setOnClickListener{
           finish()
        }

    }
}