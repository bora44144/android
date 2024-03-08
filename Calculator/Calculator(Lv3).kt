package com.example.calculator

fun main() {
    var number = 0

    while (number != -1) {
        number = readLine()!!.toInt()

        when (number) {
            1 -> println(AddOperation().operation(readLine()!!.toInt(), readLine()!!.toInt()))
            2 -> println(SubstractOperation().operation(readLine()!!.toInt(), readLine()!!.toInt()))
            3 -> println(MultiplyOperation().operation(readLine()!!.toInt(), readLine()!!.toInt()))
            4 -> println(DivideOperation().operation(readLine()!!.toInt(), readLine()!!.toInt()))
        }
    }
}

open class Calculator() {
    open fun operation(num1: Int, num2: Int) : Int = 0
}

class AddOperation() : Calculator() {
    override fun operation(num1: Int, num2: Int): Int = num1 + num2
}

class SubstractOperation() : Calculator() {
    override fun operation(num1: Int, num2: Int): Int = num1 - num2
}

class MultiplyOperation() : Calculator() {
    override fun operation(num1: Int, num2: Int) : Int = num1 * num2
}

class DivideOperation() : Calculator() {
    override fun operation(num1: Int, num2: Int) : Int = num1 / num2
}