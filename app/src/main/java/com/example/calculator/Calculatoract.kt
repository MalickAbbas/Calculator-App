package com.example.calculator

open class Calculatoract {
    data class Number(val number: Int): Calculatoract()
    object Clear: Calculatoract()
    object Delete: Calculatoract()
    data class Operation(val operation: CalculateOpr): Calculatoract()
    object Calculate: Calculatoract()
    object Decimal: Calculatoract()
}