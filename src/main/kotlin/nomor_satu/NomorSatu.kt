package nomor_satu

import java.util.*

fun pengecekanBilangan(input: Int){
    if (input<=0 || input>100) {
        print("Maaf, inputan Anda tidak sesuai dengan yang diminta soal.\n")
    } else if (input % 3 == 0 && input % 5 ==0) {
        print("Hello World\n")
    } else if (input % 5 == 0) {
        print("World\n")
    } else if (input % 3 == 0) {
        print("Hello\n")
    } else {
        print("Inputan Error.\n")
    }
}

fun main() {
    println("Soal Nomor 1\n")
    do {
        print("Masukkan sebuah bilangan (1 s/d 100): ")
        var inputBilangan: Int = readLine()?.toInt()!!
        pengecekanBilangan(inputBilangan)

        print("Apakah ingin menginputkan angka lagi(y/n)? ")
        var scanner = Scanner(System.`in`)
        var decision = scanner.next().single()
    } while (decision == 'y' || decision == 'Y')

}