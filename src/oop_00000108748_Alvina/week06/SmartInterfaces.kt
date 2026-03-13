package oop_00000108748_Alvina.week06

interface SmartDevice {
    val id : String
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