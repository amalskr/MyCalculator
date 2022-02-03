package com.ceylonapz.mycalculator

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class TestUiActivity : AppCompatActivity() {
    private lateinit var constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_ui_mover)


    }
}