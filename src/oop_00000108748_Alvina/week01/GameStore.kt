package oop_00000108748_Alvina.week01

fun main () {
    val gameTitle : String = "Hogwarts Legacy"
    val price : Int = 819000
    val pesan: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote = pesan ?: "Tidak ada catatan"

    printReceipt(gameTitle, price, finalPrice, userNote)
}

fun calculateDiscount(price: Int) =  if (price > 500000) price * 20/100 else price * 10/100

fun printReceipt (gameTitle: String, price: Int, finalPrice: Int, userNote: String) {
    println("Judul: $gameTitle")
    println("Harga Awal: $price")
    println("Harga Akhir: $finalPrice")
    println("User Note: $userNote")
}