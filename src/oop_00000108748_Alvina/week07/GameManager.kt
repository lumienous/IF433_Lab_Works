package oop_00000108748_Alvina.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning == false) {
            isGameRunning = true
            println("Memulai Game Engine...")
        } else {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }
    }
}