package oop_00000108748_Alvina.week06

class SmartSpeaker(override val id:String, override val nama: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $nama ($id) dinyalakan.")
    }

    override fun turnOff() {
        println("Speaker $nama ($id) dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}