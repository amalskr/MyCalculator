package com.ceylonapz.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var principalEditText: EditText
    lateinit var interrestEditText: EditText
    lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        principalEditText = findViewById(R.id.principal_amt)
        interrestEditText = findViewById(R.id.interrst_amt)
        resultView = findViewById(R.id.simple_interest_result_view)
    }

    fun calculate(view: View) {
        val principal = principalEditText.text.toString().toDouble()
        val interrest = interrestEditText.text.toString().toDouble()
        resultView.text = SimpleInterestCalculator().calculateInterest(principal,interrest).toString()
    }
}