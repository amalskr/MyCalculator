package com.ceylonapz.mycalculator

class SimpleInterestCalculator {

    private val time = 12 // months
    private val rate = 15 // interster 15%

    fun calculateInterest(principal: Double): Double {
        return ((principal * rate)/100)/time
    }
}