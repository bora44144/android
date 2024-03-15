package com.example.kiosk

fun main() {
    val menuList = arrayListOf<Menu>()
    val selectList = arrayListOf<Menu>()

    init(menuList)

    var select: Int = -1
    var selectMenu: Int = 0
    var orderCheck: Int = 0
    var balance: Int = 10000

    println("메뉴를 선택하세요")

    while (select != 0) {
        println("1. 버거")
        println("2. 아이스크림")
        println("3. 음료")
        println("4. 주문")
        println("0. 종료")

        while (true) {
            try {
                select = readln().toInt()

                if (select < 0 || select > 4) {
                    println("다시 입력해주세요")
                } else if (select > 0 || select <= 4) {
                    break
                }
            } catch(e:java.lang.NumberFormatException) {
                println("숫자를 입력해주세요")
            }
        }
        if (select in 1..3) {
            when (select) {
                1 -> {
                    println("1. ${menuList[0].name} ${menuList[0].price}원")
                    println("2. ${menuList[1].name} ${menuList[1].price}원")
                    println("3. ${menuList[2].name} ${menuList[2].price}원")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[0])
                                println("${menuList[0].name} 추가")
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[1])
                                println("${menuList[1].name} 추가")
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[2])
                                println("${menuList[2].name} 추가")
                            } else if (selectMenu == 0) {
                                println("뒤로가기")
                                break
                            } else if (selectMenu < 0 || selectMenu > 3) {
                                println("다시 입력해주세요")
                            }
                        } catch(e:java.lang.NumberFormatException) {
                            println("숫자를 입력해주세요")
                        }
                    }
                }
                2 -> {
                    println("1. ${menuList[3].name} ${menuList[3].price}원")
                    println("2. ${menuList[4].name} ${menuList[4].price}원")
                    println("3. ${menuList[5].name} ${menuList[5].price}원")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[3])
                                println("${menuList[3].name} 추가")
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[4])
                                println("${menuList[4].name} 추가")
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[5])
                                println("${menuList[5].name} 추가")
                            } else if (selectMenu == 0) {
                                println("뒤로가기")
                                break
                            } else if (selectMenu < 0 || selectMenu > 3) {
                                println("다시 입력해주세요")
                            }
                        } catch(e:java.lang.NumberFormatException) {
                            println("숫자를 입력해주세요")
                        }
                    }
                }
                3 -> {
                    println("1. ${menuList[6].name} ${menuList[6].price}원")
                    println("2. ${menuList[7].name} ${menuList[7].price}원")
                    println("3. ${menuList[8].name} ${menuList[8].price}원")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[6])
                                println("${menuList[6].name} 추가")
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[7])
                                println("${menuList[7].name} 추가")
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[8])
                                println("${menuList[8].name} 추가")
                            } else if (selectMenu == 0) {
                                println("뒤로가기")
                                break
                            } else if (selectMenu < 0 || selectMenu > 3) {
                                println("다시 입력해주세요")
                            }
                        } catch(e:java.lang.NumberFormatException) {
                            println("숫자를 입력해주세요")
                        }
                    }
                }
            }
        } else if (select == 4) {
            if (selectList.isEmpty()) {
                println("메뉴를 선택하고 주문해주세요")
            } else {
                var total = 0
                for (i in selectList) {
                    println("${i.name} ${i.price}원")
                    total += i.price
                }
                println("주문 금액: ${total}")
                if (total > balance) {
                    println("잔액이 부족합니다")
                    println("잔액: ${balance}")
                } else {
                    println("주문하시겠어요?")
                    println("1. 주문")
                    println("2. 취소")
                    while (true) {
                        try {
                            orderCheck = readln().toInt()
                            if (orderCheck == 1) {
                                println("주문이 완료되었습니다")
                                break
                            } else if (orderCheck == 2) {
                                println("주문이 취소되었습니다")
                                break
                            } else if (orderCheck < 1 || orderCheck > 2) {
                                println("다시 입력해주세요")
                            }
                        } catch(e:java.lang.NumberFormatException) {
                            println("숫자를 입력해주세요")
                        }
                    }
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