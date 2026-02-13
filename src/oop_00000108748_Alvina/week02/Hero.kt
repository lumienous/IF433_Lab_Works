package oop_00000108748_Alvina.week02

import java.util.Scanner

class Hero (
    var name: String,
    var baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name strikes $targetName with force!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp <= 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean = if (hp > 0) true else false
}

fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp = 100

    println("--------------------")
    println("  MINI BATTLE GAME ")
    println("--------------------")

    println("")

    val stages = listOf(
        "█▒▒▒▒▒▒▒▒▒10%",
        "████▒▒▒▒▒▒30%",
        "█████▒▒▒▒▒50%",
        "████████▒▒80%",
        "██████████100%"
    )

    for (stage in stages) {
        println(stage)
        Thread.sleep(1000) // delay 0.5 detik
    }

    println("")
    println("<<<<< WELCOME >>>>>")

    println("")
    print("Input Name: ")
    val name = scanner.nextLine()

    var dmg: Int
    while (true) {
        print("Input Damage Power (15-25): ")
        dmg = scanner.nextInt()

        if (dmg in 15..25) {
            break
        } else {
            print("INVALID: Damage Power must be between 15 and 25\n\n")
        }
    }

    var player = Hero(name, dmg)
    println("A hero ${player.name} is ready to dominate the battlefield!")

    println("")
    println("PREPARING THE BATTLEFIELD...")
    println("<<<<< THE BATTLE BEGINS >>>>>")
    println("")

    var opsi: Int
    while (player.isAlive() && enemyHp > 0) {
        println("Player: ${player.hp}     Enemy: $enemyHp")
        println("=== Choose Your Action ===")
        println("1. Attack")
        println("2. Run Away")
        print(">> ")
        opsi = scanner.nextInt()

        if (opsi == 1) {
            println("")
            player.attack("Enemy")
            enemyHp -= player.baseDamage
        } else if (opsi == 2) {
            println("You chose to retreat from the battle.")
            println("")
            break
        } else {
            println("Your choice is out of range!")
            println("")
            continue
        }

        if (enemyHp > 0) {
            println("The enemy strikes back!")
            player.takeDamage(damage = (10..20).random())
        }

        println("")

    }

    if (enemyHp <= 0 || player.hp > enemyHp) {
        println("---------------------")
        println("   CONGRATULATIONS")
        println("       YOU WIN! ")
        println("---------------------")
    } else if (player.hp <= 0) {
        println("-------------------------")
        println("         GAME OVER")
        println("  Better Luck Next Time")
        println("-------------------------")
    } else if (player.hp == enemyHp) {
        println("-----------------------")
        println("          DRAW")
        println("  Both Fighters Fell!")
        println("-----------------------")
    }

}