package oop_00000108748_Alvina.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    val BTC = Coin("BTC", 2.0)
    val ETH= Coin("ETH", 3.0)
    val USDT = Coin("USDT", 1.5)

    coinRepo.add(BTC)
    coinRepo.add(ETH)
    coinRepo.add(USDT)

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== Crypto Dashboard ===")
    println("Responses status: ${response.status}")
    response.data.forEach { println(it) }

    val txRepo = WalletRepository<Transaction>()
    val t1 = Transaction("BTC", 2.0)
    val t2 = Transaction("ETH", 3.0)
    val t3 = Transaction("USDT", 1.5)

    txRepo.add(t1)
    txRepo.add(t2)
    txRepo.add(t3)

    println("\n=== Transactions ===")
    txRepo.getAll().forEach { println(it) }
}
