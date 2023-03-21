package com.appvdev.application.degiskenler

fun main() {

    var ogrenciAdi = "Ömer"
    var yas = 23
    var boyu = 1.98
    var basharf = 'A'
    var devamEdiyorMu = true


    println("Adı: " + ogrenciAdi)
    println("Yaş: "+yas)
    println("Boyu: "+boyu)
    println("Baş Harfi: "+basharf)
    println("Devam Ediyour mu: "+devamEdiyorMu)

    var urun_id : Int = 3416
    var urun_adi : String = "MacBook Pro"
    var urun_adet :Int = 100
    var urun_fiyat : Int = 42999
    var urun_tedarikci: String = "Appple"

    println("Ürün Id : " + urun_id)
    println("Ürün Adı : $urun_adi")
    println("Ürün Adet : $urun_adet")
    println("Ürün Fiyat : $urun_fiyat ₺ ")
    println("Ürün Tedarikçi : $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${a*b} " )

    //Sabitler - Constant
    //let - swift, final - java, val - kotlin
    //var = tanımladığın zaman sonradan değerini değiştirebilirim demekMülakat Sorusu olabilir**
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    //val değeri değiştirmeyen sayılarda kullanılır sabit bir alan atıyor
    val numara = 90
    println(numara)
    //numara = 100


    //Tür dönüşümü - Type casting
    //Sayısaldan sayısala

    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //Sayısaldan Metine dönüşüm
    val sonuc3 = i.toString() // "42"
    println(sonuc3)

    val sonuc4 = d.toString() //"78.95"
    println(sonuc4)

    //Metinden sayısala dönüşüm
    val yazi = "67.54"
    val sonuc5 = yazi.toDoubleOrNull()// Double dönüştür sonuc null alırsan Double olarak yazma

    //Yöntem 1
    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm Hatası")
    }

    //Yöntem 2 Sonuc5 içinde değer var mı diyoruz yoksa çalıştırmıyor
    sonuc5?.let {
        println(it)
    }

}














