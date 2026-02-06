package oop_00000108748_Alvina.week01

fun main () {
    val gameTitle : String = "Hogwarts Legacy"
    val price : Int = 819000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int) =  if (price > 500000) price * 20/100 else price * 10/100
