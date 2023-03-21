package com.appvdev.application.standart_programlama

fun main() {
    val yas = 17
    val isim = "Mehmet"

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if(isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if(isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan Kişi")
    }

    val ka = "admin"
    val s = 12345

    if (ka == "admin" && s == 123456){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }


    val sayi = 10

    if (sayi == 10 || sayi == 20){
        println("Sayi 10 veya 20 dir")
    }else{
        println("Sayı 10 veya 20 değildir")
    }


    //Switch - When
    val gun = 32

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok") //default
    }

}