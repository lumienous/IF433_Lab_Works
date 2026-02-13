package oop_00000108748_Alvina.week02

class Loan (
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int = if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}

