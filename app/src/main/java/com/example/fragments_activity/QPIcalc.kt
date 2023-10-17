package com.example.fragments_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class QPIcalc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qpicalc)

        val btnA: Button = findViewById(R.id.btnA)
        val btnBP: Button = findViewById(R.id.btnBP)
        val btnB: Button = findViewById(R.id.btnB)
        val btnCP: Button = findViewById(R.id.btnCP)
        val btnC: Button = findViewById(R.id.btnC)
        val btnF: Button = findViewById(R.id.btnF)
        val btnD: Button = findViewById(R.id.btnD)
        val btnU3: Button = findViewById(R.id.btnU3)
        val btnU5: Button = findViewById(R.id.btnU5)
        val btnU9: Button = findViewById(R.id.btnU9)

        btnU3.isEnabled = false
        btnU5.isEnabled = false
        btnU9.isEnabled = false

//        val numEquiv = mapOf(
//            "A" to 4,
//            "B+" to 3.5,
//            "B" to 3,
//            "C+" to 2.5,
//            "C" to 2,
//            "D" to 1,
//            "F" to 0
//        )

        var letterTimesNumberequiv =0.00
        var recentLetterVal =0.00
        var totalUnits =0

        //get the number equivalent of the letter grade
        //after getting the letter grade, multiply the number equivalent to the unit of that grade
            //unit is the number button

        btnA.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnA.text.toString()
            recentLetterVal = 4.0
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }

            }

            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true
        }


        btnBP.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnBP.text.toString()
            recentLetterVal = 3.5
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnB.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            recentLetterVal = 3.0
            val value = btnB.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnCP.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnCP.text.toString()
            recentLetterVal = 2.5

            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnC.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnC.text.toString()
            recentLetterVal = 2.0
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnF.setOnClickListener{

            val etEquation: EditText
            recentLetterVal = 0.0
            etEquation = findViewById(R.id.etEquation)
            val value = btnF.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnD.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnD.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            recentLetterVal = 1.0
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }




        btnU3.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU3.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            letterTimesNumberequiv =letterTimesNumberequiv+ recentLetterVal * value.toInt()
            totalUnits = totalUnits + value.toInt()
            Log.d("ZZZ123","letterTimesNumberequiv: ${letterTimesNumberequiv} ")
            Log.d("ZZZ123","Equation text length: ${totalUnits} ")

            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }

            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        btnU5.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU5.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            letterTimesNumberequiv =letterTimesNumberequiv+ recentLetterVal * value.toInt()
            totalUnits = totalUnits + value.toInt()

            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        btnU9.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU9.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            letterTimesNumberequiv =letterTimesNumberequiv+ recentLetterVal * value.toInt()
            totalUnits = totalUnits + value.toInt()
            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        val btnClear: Button
        btnClear = findViewById(R.id.btnClear)
        btnClear.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            etEquation.setText("Equation")
            val qpiText: EditText
            qpiText = findViewById(R.id.etQPI)
            qpiText.setText("QPI")
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false
        }


        val btnEq: Button
        btnEq = findViewById(R.id.btnEq)
        btnEq.setOnClickListener{
            val qpiText: EditText = findViewById(R.id.etQPI)
            var qpi = letterTimesNumberequiv/totalUnits
            qpiText.setText(qpi.toString())
        }



    }
}