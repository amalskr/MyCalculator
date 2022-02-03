package com.ceylonapz.mycalculator

class SimpleInterestCalculator {

    private val time = 20
    private val rate = 15

    fun calculateInterest(principal: Double): Double {
        return principal * rate * time
    }
}