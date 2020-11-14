package com.example.creditcardmembership

import android.util.Log

open class ClassicMembership(val firstName: String, val lastName: String, val age: Int, val id: Int) {
open var income = 0
var cardlimit = 0
val TAG = "Classic"
init {
    Log.i(TAG,  "You have Classic membership")
}
private val promotion= 2
 constructor(first: String, last: String, a: Int, i: Int, inc: Int): this(first,last,a,i){   //Second constructor
    this.income = inc
 }
open fun limitCalculator(){  //calculates the limit of credit card (I made this method up, It's my imaginary Bank Company)
    cardlimit= income * 4
}
fun printUserInfo(){    //Overloading function printUserInfo
    println("Membership Level: $TAG , Name: $firstName, Surname: $lastName")
}
fun printUserInfo(password: String){
    println("Membership Level: $TAG , Name: $firstName, Surname: $lastName, Password: $password")
}

}