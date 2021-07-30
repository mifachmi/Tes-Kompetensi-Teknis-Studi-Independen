package nomor_tiga

import java.util.*

fun konversiWaktu(input: String) {
    val pembeda = input.split(" ")[1]
    val waktu = input.split(":")
    val hour = waktu[0]
    val minute = waktu[1]

    if (pembeda.equals("PM")) {
        if (!hour.equals("12")) {
            println("${hour.toInt()+12}:$minute")
        } else {
            println("$hour:$minute")
        }
    } else if (pembeda.equals("AM")) {
        if (!hour.equals("12")) {
            println("$hour:$minute")
        } else {
            println("00:$minute")
        }
    } else {
        println("Tidak sesuai format")
    }

}

fun main() {
    println("Soal Nomor 3\n")
    do {
        print("Masukkan sebuah waktu(HH:MM:SS PM/AM): ")
        var inputWaktu = readLine()

        if (inputWaktu != null) {
            konversiWaktu(inputWaktu)
        }

        print("Apakah ingin menginputkan angka lagi(y/n)? ")
        var scanner = Scanner(System.`in`)
        var decision = scanner.next().single()
    } while (decision == 'y' || decision == 'Y')

}