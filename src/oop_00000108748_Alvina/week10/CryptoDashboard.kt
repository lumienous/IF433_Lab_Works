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

}
