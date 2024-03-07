package com.example.calculator

// Lv2
// Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고, 
// 연산 진행 후 출력하기

// Lv1에서 만든 Calculator 클래스에 나머지 연산자(%)를 추가하기.
// 그리고 -1을 입력 할 때까지 계산을 반복합니다. (1번 +, 2번 -, 3번 *, 4번 /, 5번 %)

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