package oop_00000108748_Alvina.week06

class SmartLamp(override val id:String, override val nama: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("[LOG] Lampu $nama ($id) dinyalakan.")
    }
    override fun turnOff() {
        println("[LOG] Lampu $nama ($id) dimatikan.")
    }
}