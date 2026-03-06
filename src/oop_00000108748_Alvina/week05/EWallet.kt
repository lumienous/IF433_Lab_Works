package oop_00000108748_Alvina.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance - amount < 0) {
            println("Saldo tidak cukup.")
        } else {
            balance -= amount
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}