package oop_00000108748_Alvina.week05

fun main() {
    val luas = MathHelper()

    println("--- Luas Persegi ---")
    println("Jika persegi berukuran 5 cm, maka luasnya adalah ${luas.hitungLuas(5)}")
    println("\n--- Luas Persegi ---")
    println("Jika persegi panjang berukuran 5 x 10 cm, maka luasnya adalah ${luas.hitungLuas(5, 10)}")
    println("\n--- Luas Lingkaran ---")
    println("Jika lingkaran memiliki jari-jari sepanjang 10 cm, maka luasnya adalah ${luas.hitungLuas(10.0)}")

}