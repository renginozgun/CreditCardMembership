package com.example.creditcardmembership

import android.util.Log

class StudentMembership(val firstnameStu: String, val lastnameStu: String, val ageStu: Int, val idStu: Int, var inc: Int =0): ClassicMembership(firstnameStu, lastnameStu, ageStu, idStu) {
    private val TAG3 = "Student"
    val defaultlimit=0
    init {
        Log.i(TAG3, "You have Student membership")
    }
    override fun limitCalculator() {     // Override a function from parent class
        println("Since you don't have an income of $income, your credit card limit is: $defaultlimit")
    }
}

