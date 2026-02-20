package oop_00000108748_Alvina.week03

class Player (val username: String) {
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            var temp = level
            xp += amount
            if (level > temp) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("Sorry amount must be greater than zero.")
        }
    }
}