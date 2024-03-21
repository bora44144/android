package com.example.kiosk

class Order {
    fun orderMenu(menu: Menu) {
        println("${menu.name} 추가")
    }

    fun allOrderMenu(menus: ArrayList<Menu>): Int {
        var total = 0
        for (menu in menus) {
            println("${menu.name} ${menu.price}원")
            total += menu.price
        }
        return total
    }
}