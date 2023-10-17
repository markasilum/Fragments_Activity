package com.example.fragments_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.fragments_activity.ui.dashboard.DashboardFragment
import com.example.fragments_activity.ui.dashboard.DashboardViewModel

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        val btnLogin: Button
        btnLogin = findViewById(R.id.btLogin)
        btnLogin.setOnClickListener{

            val dashboard: Intent
            dashboard = Intent(this,MainActivity::class.java)
            startActivity(dashboard)

        }
    }
}