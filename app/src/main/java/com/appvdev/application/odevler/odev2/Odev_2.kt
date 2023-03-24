package com.appvdev.application.odevler.odev2

class Odev_2 {

    fun soru1(derece: Int): Int {
        println("${derece} Derece = ${derece * 1.8 + 32} Fahrenhiet")

        return derece
    }

    fun soru2(genisKenarUzunlugu: Int, kısaKenarUzunlugu: Int) {
        println("Geniş Kenar Uzunluğu = ${genisKenarUzunlugu} , Kısa Kenar Uzunluğu = ${kısaKenarUzunlugu}  Olan Diktörgenin Çevresi : ${2 * (genisKenarUzunlugu + kısaKenarUzunlugu)}birim")

    }

    fun soru3(faktoriyel: Int) {
        var sayac = 1
        var carpma = 1
        while (sayac <= faktoriyel) {
            carpma = carpma * sayac
            sayac++
        }
        println("$faktoriyel Faktöriyel = ${carpma}")

    }

    fun soru4(kelime: String): Int {
            var sayıcı = 0
            for (char in kelime) {
                if (char == 'a') {
                    sayıcı++
                }
            }
        println("Kelimenin içinde $sayıcı adet 'a' harfi var.")

        return sayıcı
    }

    fun soru5(kenarSayisi: Int): Int {
        println("İç açıların toplamı: ${(kenarSayisi - 2) * 180} derecedir")
        return kenarSayisi
    }

    fun soru6(gun: Int): Int {
        var maas = 0
        if (gun <= 20) {
            maas = gun * 80
        } else if (gun >= 21) {
            var mesai = (gun - 20) * 160
            maas = 1600 + mesai
        }

        println("Maaş : ${maas}₺")

        return gun
    }

    fun soru7(miktar: Int): Int {
        if (miktar <= 50) {
            println("İnternet faturanız : 100₺")
        } else {
            var kota = (miktar - 50) * 4
            println("İnternet faturanız : ${100 + kota}₺")
        }

        return miktar
    }

}