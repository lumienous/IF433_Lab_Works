package oop_00000108748_Alvina.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus() : Int = 10 * baseSalary / 100
}