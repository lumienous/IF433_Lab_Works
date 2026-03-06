package oop_00000108748_Alvina.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}