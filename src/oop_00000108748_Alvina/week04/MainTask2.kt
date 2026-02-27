package oop_00000108748_Alvina.week04

fun main() {
    println("=============================")
    println("    PPIF 2026 CORPORATION")
    println("=============================")
    println("PROJECT MANAGER's LOG")
    val manager = Manager("Alvina", 10000000)
    manager.work()
    println("${manager.name} sudah selesai bekerja dan mendapatkan bonus sebesar Rp. ${manager.calculateBonus()}")

    println("\nDEVELOPER's LOG")
    val dev = Developer("Willbert Budi Lian", 10000000, "Kotlin")
    dev.work()
    println("${dev.name} sudah selesai bekerja dan mendapatkan bonus sebesar Rp. ${dev.calculateBonus()}")


}