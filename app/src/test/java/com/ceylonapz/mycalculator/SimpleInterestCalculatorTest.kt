package com.ceylonapz.mycalculator

import org.junit.Assert
import org.junit.Assert.*

import org.junit.Test

class SimpleInterestCalculatorTest {

    @Test
    fun calculateInterest() {
        val simpleInterestCalculator = SimpleInterestCalculator()
        val principal = 2000.0
        val interest =  ((principal * 15)/100)/12
        Assert.assertEquals(interest, simpleInterestCalculator.calculateInterest(principal), 25.0)
    }
}