package com.example.kiosk

open class Menu(val name: String, val price: Int) {
    fun displayInfo() {
        println("$name ${price}원")
    }
}