package com.example.kiosk

open class Menu(val name: String, val price: Int) {
    open fun displayInfo(): String {
        return "${name} ${price}원"
    }
}