package nomor_empat

import java.util.*

fun main() {
    println("Aplikasi Reverse String\n")
    do {
        print("Masukkan sebuah sembarang string: ")
        var inputString: String? = readLine()
        if (inputString != null) {
            println("Hasil reverse: ${inputString.reversed()}")
        }

        print("Apakah ingin menginputkan angka lagi(y/n)? ")
        var scanner = Scanner(System.`in`)
        var decision = scanner.next().single()
    } while (decision == 'y' || decision == 'Y')
}