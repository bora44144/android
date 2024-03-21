package com.example.kiosk

fun main() {
    val menuList = arrayListOf<Menu>()

    init(menuList)

    println("메뉴를 선택하세요")
    println("1: 버거, 2: 아이스크림, 3: 음료, 0: 종료")
    var select: Int = -1

    while (select != 0) {
        select = readln().toInt()
        when (select) {
            1 -> {
                menuList[0].displayInfo()
                menuList[1].displayInfo()
                menuList[2].displayInfo()
            }
            2 -> {
                menuList[3].displayInfo()
                menuList[4].displayInfo()
                menuList[5].displayInfo()
            }
            3 -> {
                menuList[6].displayInfo()
                menuList[7].displayInfo()
                menuList[8].displayInfo()
            }
            0 -> println("종료")
        }
    }
}

fun init(menuList: ArrayList<Menu>) {
    menuList.add(BurgerMenu("햄버거", 2000))
    menuList.add(BurgerMenu("치즈버거", 3000))
    menuList.add(BurgerMenu("새우버거", 4000))
    menuList.add(IcecreamMenu("바닐라아이스크림", 2000))
    menuList.add(IcecreamMenu("초코아이스크림", 2500))
    menuList.add(IcecreamMenu("딸기아이스크림", 2500))
    menuList.add(DrinkMenu("콜라", 2000))
    menuList.add(DrinkMenu("사이다", 2000))
    menuList.add(DrinkMenu("아메리카노", 3000))
}