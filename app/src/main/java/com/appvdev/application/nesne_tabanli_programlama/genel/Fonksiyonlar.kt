package com.appvdev.application.nesne_tabanli_programlama.genel

class Fonksiyonlar {

    //void (geri dönüş olmayan fonksiyonlar)
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return Geri dönüş değeri olan fonksiyon
    fun selamla2() : String{
       val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametre
    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1:Int, sayi2:Int) : Int{
        val  toplam = sayi1 + sayi2
        return toplam
    }

    //Overloading -> aynı fonsiyonu aynı isimde farklı parametreler de kullanıyorsak overloading oluyor
    // bunun için dizilimler değiştir

    fun carpma(sayi1: Int,sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carpma(sayi1: Double,sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carpma(sayi1: Int,sayi2: Int,isim: String){
        println("Çarpma : ${sayi1*sayi2} - işlem yapan : $isim")
    }
}