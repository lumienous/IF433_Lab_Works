package oop_00000108748_Alvina.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {println("Monster muncul: ${event.monsterName}!")}
        is BattleState.LootDropped -> { println("Kamu mendapatkan item: ${event.item.name} (${event.item.rarity})")}
        is BattleState.GameOver -> {println("Game Over! Kamu kalah.")}
        is BattleState.SafeZone -> {println("Kamu berada di zona aman.")}
    }
}