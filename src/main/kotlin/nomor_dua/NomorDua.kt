package nomor_dua

import java.util.*

fun main() {
    println("Soal Nomor 2\n")
    do {
        print("Masukkan email Anda : ")
        val email = readLine()
        if (email != null && email.validateEmail()) {
            print("Email Anda valid.\n")
        } else {
            print("Email Anda tidak valid.\n")
        }

        print("Apakah ingin menginputkan angka lagi(y/n)? ")
        var scanner = Scanner(System.`in`)
        var decision = scanner.next().single()
    } while (decision == 'y' || decision == 'Y')

}

fun String.validateEmail(): Boolean = this.matches(Regex("[A-Za-z0-9]{1,20}@[A-Za-z0-9]+.(id|co.id)+"))