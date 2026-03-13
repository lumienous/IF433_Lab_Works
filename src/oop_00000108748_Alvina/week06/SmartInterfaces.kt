package oop_00000108748_Alvina.week06

interface SmartDevice {
    val id : SmartDevice
    val nama : String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() { println("Perekaman dihentikan dan disimpan ke Cloud.") }
}