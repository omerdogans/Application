package com.appvdev.application

fun main() {
    //1.Compile error
    val x = 10
    //x =5

    //1.Runtime Exception(Error)
    val a = 10
    val b = 0



    try {
        println("Sonuç : ${a/b}")
        println("İşlem tamam")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz")

    }
}