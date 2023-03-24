package com.appvdev.application.nesne_tabanli_programlama.genel

fun main() {
    val f = Fonksiyonlar()//nesne oluşturmak classa erişmemiz için Unit olursa void

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    //toplama
    val gelenToplam = f.toplama(10,20)
    println("Gelen Toplam : $gelenToplam")

    f.carpma(3,5,"Mehmet")

    val sonuc = 8.carpi(6)
    println(sonuc)

    val sonuc1 = 8 carpi1 2 carpi1 6
    println(sonuc1)

}

fun Int.carpi(sayi:Int) : Int{//extension fonksiyon
    return this * sayi
}//this : bulunduğu sınıfı temsil eder, (self = swift)

infix fun Int.carpi1(sayi:Int) : Int{//extension fonksiyon
    return this * sayi
}//this : bulunduğu sınıfı temsil eder, (self = swift) , Döngülerdeki step adımını oluşturmak amacımız