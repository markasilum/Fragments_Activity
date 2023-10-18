package com.example.fragments_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout

class Play : AppCompatActivity() {
    var mute = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val btMute = ImageButton(this)
        btMute.setImageResource(R.drawable.iconunmute)
        val linearLayout = findViewById<LinearLayout>(R.id.mutegear)
        linearLayout.addView(btMute)

        val btGear = ImageButton(this)
        btGear.setImageResource(R.drawable.icongear)
        linearLayout.addView(btGear)

        btMute.setOnClickListener{
            if(mute == false){
                btMute.setImageResource(R.drawable.iconmute)
                mute = true
            }else{
                btMute.setImageResource(R.drawable.iconunmute)
                mute = false

            }

        }

        val btnExit: Button
        btnExit = findViewById(R.id.btExit)
        btnExit.setOnClickListener{
            finish()
        }







    }
}