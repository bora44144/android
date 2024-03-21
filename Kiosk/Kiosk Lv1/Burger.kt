package com.example.kiosk

open class Burger(name: String, price: Int) {
    var name: String = name
    var price: Int = price

    fun displayInfo() {
        println("$name ${price}원")
    }
}