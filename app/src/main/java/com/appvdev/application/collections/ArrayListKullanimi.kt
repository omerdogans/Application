package com.appvdev.application.collections

fun main() {

    //Tanimlama
    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")//0
    meyveler.add("Muz")//1
    meyveler.add("Kiraz")//2

    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert -Araya ekleme
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma İşlemi
    println(meyveler.get(2))
    println(meyveler[0]) //Swift gibi dilde daha çok kullanılıyor

    println(meyveler.count())
    println(meyveler.size)//Boyut
    println(meyveler.isEmpty())//Boş Mu - Boş Kontrol
    println(meyveler.contains("Kiraz"))//İçeriyor mu

    meyveler.reverse()//içeriği tam terse çeviriyor
    println(meyveler)

    meyveler.sort()//Alfabe Sırası
    println(meyveler)

    for (meyve in meyveler){

        println("Sonuç 1 : $meyve")

    }

    for ((indeks,meyve) in meyveler.withIndex()){ //Swift : enumarated
        println("$indeks. -> $meyve")
    }
    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}
