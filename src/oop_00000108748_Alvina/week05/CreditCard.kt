package oop_00000108748_Alvina.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Payment berhasil! ^__^")
        } else {
            println("Payment gagal T___T")
        }
    }
}