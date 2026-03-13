package oop_00000108748_Alvina.week06

fun main() {
    val lampu = SmartLamp("H01", "Ruang Tamu")
    val speaker = SmartSpeaker("H02", "Google Nest Dapur")
    val cctv = SmartCCTV("H03", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== ACTIVITY LOG PERANGKAT ===")
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}