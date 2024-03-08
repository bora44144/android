package com.example.calculator

fun main() {
    var number = 0
    var addCalc = Calculator(AddOperation())
    var subCalc = Calculator(SubstractOperation())
    var mulCalc = Calculator(MultiplyOperation())
    var divCalc = Calculator(DivideOperation())

    while (number != -1) {
        number = readLine()!!.toInt()

        when (number) {
            1 -> println(addCalc.operation(readLine()!!.toInt(), readLine()!!.toInt()))
            2 -> println(subCalc.operation(readLine()!!.toInt(), readLine()!!.toInt()))
            3 -> println(mulCalc.operation(readLine()!!.toInt(), readLine()!!.toInt()))
            4 -> println(divCalc.operation(readLine()!!.toInt(), readLine()!!.toInt()))
        }
    }
}

abstract class AbstractOperation() {
    abstract fun operation(num1: Int, num2: Int): Int
}

class Calculator(private val operator: AbstractOperation) {
    fun operation(num1: Int, num2: Int): Int {
        return operator.operation(num1, num2)
    }
}

class AddOperation() : AbstractOperation() {
    override fun operation(num1: Int, num2: Int): Int = num1 + num2
}

class SubstractOperation() : AbstractOperation() {
    override fun operation(num1: Int, num2: Int): Int = num1 - num2
}

class MultiplyOperation() : AbstractOperation() {
    override fun operation(num1: Int, num2: Int) : Int = num1 * num2
}

class DivideOperation() : AbstractOperation() {
    override fun operation(num1: Int, num2: Int) : Int = num1 / num2
}