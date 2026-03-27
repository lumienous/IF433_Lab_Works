package oop_00000108748_Alvina.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("\nDrop Chance Senjata Legendary: ${ItemRarity.LEGENDARY.dropChance}")
    val senjata = Weapon.forgeStarterSword()
    println("\n=== DETAIL SENJATA ===")
    println("Nama           : ${senjata.item.name}")
    println("Damage         : ${senjata.item.damage}")
    println("Rarity         : ${senjata.item.rarity}")
    println("Drop Chance    : ${senjata.item.rarity.dropChance}")
    println("Durability     : ${senjata.durability}")

    val senjata2 = senjata.item.copy(damage = 25)

    println("\n=== GAME LOG ===")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(senjata2))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}