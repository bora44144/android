package com.example.kiosk

fun main() {
    println("메뉴를 선택하세요")
    println("1: 햄버거, 2: 아이스크림, 3: 음료, 0: 종료")
    var select: Int = -1

        while (select != 0) {
        select = readLine()!!.toInt()
        when (select) {
            1 -> println("1: 햄버거, 2: 치즈버거, 3: 새우버거")
            2 -> println("1: 바닐라아이스크림, 2: 초코아이스크림, 3: 딸기아이스크림")
            3 -> println("1: 콜라, 2: 사이다, 3: 아메리카노")
            0 -> println("종료")
        }
    }
}