package com.example.kiosk

fun main() {
    val menuList = arrayListOf<Menu>()

    init(menuList)

    var select: Int = -1
    var run = 0

    println("메뉴를 골라 입력해주세요.")
    println("[ 버거버거 메뉴 ]")
    println("1. 버거\t\t | 쇠고기를 다져만든 패티")
    println("2. 아이스크림\t | 시원한 아이스크림")
    println("3. 음료\t\t | 함께 즐기는 음료")
    println("0. 종료\t\t | 메뉴 선택 종료")

    while (true) {
        select = readln().toInt()
        if (run == 0 && select == 0) {
            break
        }
        if (select in 0..3) {
            when (select) {
                1 -> {
                    run = 1
                    println("[ 버거 메뉴 ]")
                    println("1. ${menuList[0].name}\t | W ${menuList[0].price} | 버거버거 기본 햄버거")
                    println("2. ${menuList[1].name}\t | W ${menuList[1].price} |  치즈, 피클, 케첩이 토핑된 버거")
                    println("3. ${menuList[2].name}\t | W ${menuList[2].price} |  새우, 양상추, 마요네즈가 토핑된 새우버거")
                    println("0. 뒤로가기\t | 뒤로가기")
                    println("0 <-")
                }
                2 -> {
                    run = 1
                    println("[ 아이스크림 메뉴 ]")
                    println("1. ${menuList[3].name}\t | W ${menuList[3].price} |  부드러운 바닐라맛 아이스크림")
                    println("2. ${menuList[4].name}\t | W ${menuList[4].price} |  달달한 초코아이스크림")
                    println("3. ${menuList[5].name}\t | W ${menuList[5].price} |  달콤한 딸기아이스크림")
                    println("0. 뒤로가기\t | 뒤로가기")
                    println("0 <-")
                }
                3 -> {
                    run = 1
                    println("[ 음료 메뉴 ]")
                    println("1. ${menuList[7].name}\t | W ${menuList[6].price} |  시원한 콜라")
                    println("2. ${menuList[7].name}\t | W ${menuList[7].price} |  시원한 사이다")
                    println("3. ${menuList[8].name}\t | W ${menuList[8].price} |  정통 이탈리아 에스프레소의 특별한 맛 아메리카노")
                    println("0. 뒤로가기\t | 뒤로가기")
                    println("0 <-")
                }
                0 -> {
                    run = 0
                    println("[ 버거버거 메뉴 ]")
                    println("1. 버거\t\t | 쇠고기를 다져만든 패티")
                    println("2. 아이스크림\t | 시원한 아이스크림")
                    println("3. 음료\t\t | 함께 즐기는 음료")
                    println("0. 종료\t\t | 메뉴 선택 종료")
                }
            }
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