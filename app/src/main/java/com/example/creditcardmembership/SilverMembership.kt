package com.example.creditcardmembership

import android.util.Log

class SilverMembership(val firstNameSilver: String, val lastNameSilver: String, val ageSilver: Int, val idSilver: Int, var points: Int, var years: Int ): ClassicMembership(firstNameSilver, lastNameSilver, ageSilver, idSilver){
    val TAG2 = "Silver"
    init {
        Log.i(TAG2, "You have Silver membership")
    }
    override fun limitCalculator() {     // Override a function from parent class
        cardlimit = income * 8 + (years * points)  // Additional properties years since subscription and points of the user
    }
}