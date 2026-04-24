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

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformerString.forEach {
        println(it)
    }

    worstPerformerString.forEach {
        println(it)
    }

    println(uniquePairs)

// Output
//    === CRYPTO TRADING DASHBOARD ===
//    WIN [BTC/USDT - LONG]: +18.9% ROE (Lev: 8x)
//    WIN [ETH/USDT - SHORT]: +9.7% ROE (Lev: 3x)
//    WIN [XRP/USDT - SHORT]: +6.3% ROE (Lev: 12x)
//    LOSS [ETH/USDT - SHORT]: -4.2% ROE (Lev: 5x)
//    [BTC/USDT, ETH/USDT, XRP/USDT, BNB/USDT]
}