package com.example.calculator

fun main() {
    var number = 0

    while (number != -1) {
        number = readLine()!!.toInt()

        when (number) {
            1 -> println(AddOperation(readLine()!!.toInt(), readLine()!!.toInt()).operation())
            2 -> println(SubstractOperation(readLine()!!.toInt(), readLine()!!.toInt()).operation())
            3 -> println(MultiplyOperation(readLine()!!.toInt(), readLine()!!.toInt()).operation())
            4 -> println(DivideOperation(readLine()!!.toInt(), readLine()!!.toInt()).operation())
        }
    }
}

open class Calculator(_num1: Int, _num2: Int) {
    var num1 = _num1
    var num2 = _num2

    open fun operation() : Int {
        return num1 + num2
    }
}

class AddOperation(_num1: Int, _num2: Int) : Calculator(_num1, _num2) {
    override fun operation(): Int {
        return num1 + num2
    }
}

class SubstractOperation(_num1: Int, _num2: Int) : Calculator(_num1, _num2) {
    override fun operation(): Int {
        return num1 - num2
    }
}

class MultiplyOperation(_num1: Int, _num2: Int) : Calculator(_num1, _num2) {
    override fun operation() : Int {
        return num1 * num2
    }
}

class DivideOperation(_num1: Int, _num2: Int) : Calculator(_num1, _num2) {
    override fun operation() : Int {
        return num1 / num2
    }
}