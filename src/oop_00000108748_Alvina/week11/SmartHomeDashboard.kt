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

    val AC_Inverter = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(AC_Inverter)

    val petCare = run{
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    }
    homeDevices.add(petCare)

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("${it.diagnose()}")
    }

    with(homeDevices){
        println("Jumlah dari devices yang ada di dalam list: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total power usage: $totalPower")

    println("\n=== Daftar Perangkat yang Terhubung ===")
    homeDevices.forEach { println(it.diagnose()) }
}