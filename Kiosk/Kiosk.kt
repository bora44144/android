package com.example.kiosk

fun main() {
    println("메뉴를 선택하세요")
    println("1: 버거, 2: 아이스크림, 3: 음료, 0: 종료")
    var select: Int = -1

    while (select != 0) {
        select = readLine()!!.toInt()
        when (select) {
            1 -> {
                HamBurger().displayInfo()
                CheeseBurger().displayInfo()
                ShrimpBurger().displayInfo()
            }
            2 -> {
                VanillaIcecream().displayInfo()
                ChocoIcecream().displayInfo()
                StrawberryIcecream().displayInfo()
            }
            3 -> {
                Cola().displayInfo()
                Cider().displayInfo()
                Americano().displayInfo()
            }
            0 -> println("종료")
        }
    }
}