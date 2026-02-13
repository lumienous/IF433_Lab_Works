package oop_00000108748_Alvina.week02

import java.util.Scanner

class Loan (
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int = if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PEMINJAMAN BUKU ---")

    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val peminjam = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var lama = scanner.nextInt()

    scanner.nextLine()

    if(lama <= 0) {
        lama = 1
    }

    var l1 = Loan(judul, peminjam, lama)

    print("\n --- DETAIL PEMINJAMAN --- \n")
    println("Judul: ${l1.bookTitle}")
    println("Nama Peminjam: ${l1.borrower}")
    println("Durasi Peminjaman: ${l1.loanDuration}")
    println("Denda: Rp. ${l1.calculateFine()}")
}
