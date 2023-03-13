package com.example.ludo

class Dice (private val numOfSides:Int){
    fun roll():Int{
        return(1..numOfSides).random()
    }
}