package com.ceylonapz.mycalculator

class SimpleInterestCalculator {

    private val time = 12 // months

    fun calculateInterest(principal: Double, rate: Double): Double {
        return ((principal * rate) / 100) / time
    }
}