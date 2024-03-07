package com.example.calculator

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println(Calculator(num1, num2).add())
    println(Calculator(num1, num2).substract())
    println(Calculator(num1, num2).multiply())
    println(Calculator(num1, num2).divide())
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
}