package com.example.creditcardmembership

class CardInfo(var type: String, var limit: Int, var owner: String, var age: Int) {

    var _type: String = type   // Getters and Setters
        get()= field
        set(value){
            field=value
        }
    var _limit: Int = limit
        get()= field
        set(value){
            field=value
        }
    var _owner: String = owner
        get()= field
        set(value){
            field=value
        }
    var _age: Int= age   // Override a getter and Setter property.
        set(value){
            field= if(value<18) value else throw
                    IllegalArgumentException("You must be older than 18 to have a credit card.")
        }

}