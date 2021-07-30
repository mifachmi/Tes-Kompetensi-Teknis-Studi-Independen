package nomor_lima

import java.util.*

fun cekPalindrom(input: String) {
    var hasilReverse = input.split("").reversed().joinToString("")

    if (input.equals(hasilReverse)) {
        println("Termasuk Palindrom")
    } else {
        println("Tidak Termasuk Palindrom")
    }
}

fun main() {
    println("Aplikasi Cek Palindrom String\n")
    do {
        print("Masukkan sebuah sembarang string: ")
        var inputString: String? = readLine()

        if (inputString != null) {
            cekPalindrom(inputString)
        }

        print("Apakah ingin menginputkan angka lagi(y/n)? ")
        var scanner = Scanner(System.`in`)
        var decision = scanner.next().single()
    } while (decision == 'y' || decision == 'Y')
}