package com.example.calculator

open class CalculateOpr(val symbol : String) {

    object Add: CalculateOpr("+")
    object Subtract: CalculateOpr("-")
    object Multiply: CalculateOpr("x")
    object Divide: CalculateOpr("/")
}