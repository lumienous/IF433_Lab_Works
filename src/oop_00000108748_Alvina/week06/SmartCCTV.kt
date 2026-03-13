package oop_00000108748_Alvina.week06

class SmartCCTV(override val id:String, override val nama: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $nama ($id) dinyalakan.")
        startRecord()
    }

    override fun startRecord() {
        println("Kamera mulai merekam hal-hal yang terjadi")
    }
    override fun turnOff() {
        println("CCTV $nama ($id) dimatikan.")
    }
}