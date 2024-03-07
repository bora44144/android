package com.example.calculator

fun main() {
    var number = 0

    while (number != -1) {
        number = readLine()!!.toInt()

        when (number) {
            1 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).AddOperation())
            2 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).SubstractOperation())
            3 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).MultiplyOperation())
            4 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).DivideOperation())
        }
    }
}

abstract class AbstractOperation {
    abstract fun AddOperation(): Int
    abstract fun SubstractOperation(): Int
    abstract fun MultiplyOperation(): Int
    abstract fun DivideOperation(): Int
}

class Calculator(_num1: Int, _num2: Int) : AbstractOperation() {
    var num1 = _num1
    var num2 = _num2

    override fun AddOperation() : Int {
        return num1 + num2
    }
    override fun SubstractOperation() : Int{
        return num1 - num2
    }
    override fun MultiplyOperation() : Int{
        return num1 * num2
    }
    override fun DivideOperation() : Int{
        return num1 / num2
    }
}