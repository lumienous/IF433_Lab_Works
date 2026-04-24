package oop_00000108748_Alvina.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTC/USDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETH/USDT", "SHORT", 5, -4.2, "CLOSED"),
        TradeLog("BTC/USDT", "LONG", 8, 18.9, "CLOSED"),
        TradeLog("XRP/USDT", "SHORT", 12, 6.3, "CLOSED"),
        TradeLog("BNB/USDT", "LONG", 7, -2.1, "OPEN"),
        TradeLog("ETH/USDT", "SHORT", 3, 9.7, "CLOSED")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    val topPerformerString = winningTrades.sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformerString = losingTrades.sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
}