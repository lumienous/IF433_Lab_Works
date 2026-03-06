package oop_00000108748_Alvina.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance - amount < 0) {
            println("Saldo tidak cukup.")
        } else {
            balance -= amount
            println("[${accountName}] Pembayaran berhasil. >__0")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Saldo berhasil ditambahkan!")
    }
}