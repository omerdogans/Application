package com.appvdev.application.collections

fun main() {
    val u1 = Urunler(1,"Telefon",6000)
    val u2 = Urunler(2,"Saat",2000)
    val u3 = Urunler(3,"Bilgisayar",8000)

    val urunlerListesi = ArrayList<Urunler>()

    urunlerListesi.add(u1)
    urunlerListesi.add(u2)
    urunlerListesi.add(u3)

    for (u in urunlerListesi){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    //Sorting - Sıralama
    println("Fiyat Artan")
    val siralama1 = urunlerListesi.sortedWith(compareBy { it.fiyat })
    for (u in siralama1){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    println("Fiyat Azalan")
    val siralama2 = urunlerListesi.sortedWith(compareByDescending { it.fiyat })
    for (u in siralama2){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    println("Fiyat Artan")
    val siralama3 = urunlerListesi.sortedWith(compareBy { it.ad })
    for (u in siralama3){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    println("Fiyat Azalan")
    val siralama4 = urunlerListesi.sortedWith(compareByDescending { it.ad })
    for (u in siralama4){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    //Filtreleme - istediğimiz kadar bilgi almamıza yarıyor
    println("Filtreleme 1")
    val filtreleme1 = urunlerListesi.filter { it.fiyat >= 6000 && it.fiyat <= 6000 }
    for (u in filtreleme1){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    println("Filtreleme 2")
    val filtreleme2 = urunlerListesi.filter { it.ad.contains("at")}
    for (u in filtreleme2){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    println("Filtreleme 3")
    val filtreleme3 = urunlerListesi.filter { it.ad.contains("A".lowercase())}
    for (u in filtreleme3){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

}