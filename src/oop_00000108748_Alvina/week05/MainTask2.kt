package oop_00000108748_Alvina.week05

fun main() {
    val gopay = EWallet("Nyoman Ayu Carmenita", 50000.0)
    val hanaBank = CreditCard ("Ye-on", 100000.0)

    val daftarPayment: List<PaymentMethod> = listOf(gopay, hanaBank)
    println("=== PEMBAYARAN DUBAI CHEWY COOKIE ===")
    for (PaymentMethod in daftarPayment) {
        print("[${PaymentMethod.accountName}] ")

        when (PaymentMethod) {
            is EWallet -> {
                PaymentMethod.topUp(50000.0)
            }
        }
        PaymentMethod.processPayment(75000.0)
    }
}
