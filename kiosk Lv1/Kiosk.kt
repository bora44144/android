package com.example.kiosk

fun main() {
    var foodList = arrayListOf<String>("햄버거", "치즈버거", "새우버거", "바닐라아이스크림", "초코아이스크림",
        "딸기아이스크림", "콜라", "사이다", "아메리카노")
    println("메뉴를 선택하세요")
    println("1: 버거, 2: 아이스크림, 3: 음료, 0: 종료")
    var select: Int = -1

    while (select != 0) {
        select = readLine()!!.toInt()
        when (select) {
            1 -> {
                HamBurger(foodList[0], 2000).displayInfo()
                CheeseBurger(foodList[1], 3000).displayInfo()
                ShrimpBurger(foodList[2], 4000).displayInfo()
            }
            2 -> {
                VanillaIcecream(foodList[3], 1500).displayInfo()
                ChocoIcecream(foodList[4], 2000).displayInfo()
                StrawberryIcecream(foodList[5], 2000).displayInfo()
            }
            3 -> {
                Cola(foodList[6], 2000).displayInfo()
                Cider(foodList[7], 2000).displayInfo()
                Americano(foodList[8], 3000).displayInfo()
            }
            0 -> println("종료")
        }
    }
}