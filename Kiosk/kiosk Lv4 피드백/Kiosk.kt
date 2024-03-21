package com.example.kiosk

var menuList = arrayListOf<Menu>()

fun main() {
    val selectList = arrayListOf<Menu>()

    init()

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
                    println("1. ${menuList[0].displayInfo()}")
                    println("2. ${menuList[1].displayInfo()}")
                    println("3. ${menuList[2].displayInfo()}")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[0])
                                Order().orderMenu(menuList[0])
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[1])
                                Order().orderMenu(menuList[1])
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[2])
                                Order().orderMenu(menuList[2])
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
                    println("1. ${menuList[3].displayInfo()}")
                    println("2. ${menuList[4].displayInfo()}")
                    println("3. ${menuList[5].displayInfo()}")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[3])
                                Order().orderMenu(menuList[3])
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[4])
                                Order().orderMenu(menuList[4])
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[5])
                                Order().orderMenu(menuList[5])
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
                    println("1. ${menuList[6].displayInfo()}")
                    println("2. ${menuList[7].displayInfo()}")
                    println("3. ${menuList[8].displayInfo()}")
                    println("0. 뒤로가기")
                    while (true) {
                        try {
                            selectMenu = readln().toInt()
                            if (selectMenu == 1) {
                                selectList.add(menuList[6])
                                Order().orderMenu(menuList[6])
                            } else if (selectMenu == 2) {
                                selectList.add(menuList[7])
                                Order().orderMenu(menuList[7])
                            } else if (selectMenu == 3) {
                                selectList.add(menuList[8])
                                Order().orderMenu(menuList[8])
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
                var total = Order().allOrderMenu(selectList)
                println("주문 금액: ${total}")
                if (total > balance) {
                    println("잔액이 부족합니다")
                    println("잔액: ${balance}")
                } else {
                    println("주문하시겠어요?")
                    println("1. 주문")
                    println("2. 메뉴판")
                    while (true) {
                        try {
                            orderCheck = readln().toInt()
                            if (orderCheck == 1) {
                                println("주문이 완료되었습니다")
                                balance -= total
                                println("잔액: ${balance}")
                                break
                            } else if (orderCheck == 2) {
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

fun init() {
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