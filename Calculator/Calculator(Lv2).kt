package com.example.calculator

fun main() {
    var number = 0

    while (number != -1) {
        number = readLine()!!.toInt()

        when (number) {
            1 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).add())
            2 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).substract())
            3 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).multiply())
            4 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).divide())
            5 -> println(Calculator(readLine()!!.toInt(), readLine()!!.toInt()).remainder())
        }
    }
}

class Calculator(_num1: Int, _num2: Int) {
    var num1 = _num1
    var num2 = _num2

    fun add() : Int {
        return num1 + num2
    }
    fun substract() : Int {
        return num1 - num2
    }
    fun multiply() : Int {
        return num1 * num2
    }
    fun divide() : Int {
        return num1 / num2
    }
    fun remainder() : Int {
        return num1 % num2
    }
}