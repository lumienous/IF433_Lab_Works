package oop_00000108748_Alvina.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("BYD", 4, 100)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}
