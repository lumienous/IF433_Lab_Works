package oop_00000108748_Alvina.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("Philips WiZ Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}