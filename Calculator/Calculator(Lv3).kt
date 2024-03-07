package com.example.calculator

// Lv3
// AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 
// 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
// - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경하기
//     - 나머지 연산자(%) 기능은 제외합니다.
// - Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
//     - hint. 클래스의 책임(단일책임원칙)

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