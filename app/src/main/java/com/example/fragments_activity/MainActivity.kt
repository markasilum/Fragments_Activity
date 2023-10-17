package com.example.fragments_activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fragments_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val btnInput: Button
        btnInput = findViewById(R.id.btInput)
        btnInput.setOnClickListener{

            val inputScreen: Intent
            inputScreen = Intent(this,InputActivity::class.java)
            startActivity(inputScreen)

            Log.d("aaa","input button clicked")

        }
        val btnQpi: Button
        btnQpi = findViewById(R.id.btQpiCalc)
        btnQpi.setOnClickListener{

            val qpiCalcScreen: Intent
            qpiCalcScreen = Intent(this,QPIcalc::class.java)
            startActivity(qpiCalcScreen)
            Log.d("aaa","qpi button clicked")

        }
    }
}