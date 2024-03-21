package com.example.kiosk

fun main() {
    var select = -1
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
                    println("1. 햄버거\t | W 3.0 | 버거버거 기본 햄버거")
                    println("2. 치즈버거\t | W 4.0 |  치즈, 피클, 케첩이 토핑된 버거")
                    println("3. 새우버거\t | W 5.0 |  새우, 양상추, 마요네즈가 토핑된 새우버거")
                    println("0. 뒤로가기\t | 뒤로가기")
                    println("0 <-")
                }
                2 -> {
                    run = 1
                    println("[ 아이스크림 메뉴 ]")
                    println("1. 바닐라아이스크림 | W 3.0 |  부드러운 바닐라맛 아이스크림")
                    println("2. 초코아이스크림\t | W 3.0 |  달달한 초코아이스크림")
                    println("3. 딸기아이스크림\t | W 3.0 |  달콤한 딸기아이스크림")
                    println("0. 뒤로가기\t | 뒤로가기")
                    println("0 <-")
                }
                3 -> {
                    run = 1
                    println("[ 음료 메뉴 ]")
                    println("1. 콜라\t\t | W 2.0 |  시원한 콜라")
                    println("2. 사이다\t | W 2.0 |  시원한 사이다")
                    println("3. 아메리카노\t | W 3.0 |  정통 이탈리아 에스프레소의 특별한 맛 아메리카노")
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