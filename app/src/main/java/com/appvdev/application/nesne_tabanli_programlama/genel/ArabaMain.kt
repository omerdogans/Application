package com.appvdev.application.nesne_tabanli_programlama.genel

fun main() {
    //Nesne Oluşturma
    val bmw = Araba("Kırmızı",0,false)

    //Okuma işlemi
    bmw.bilgiAl()
  /*println("Renk         : ${bmw.renk}")
    println("Hız          : ${bmw.hiz}")
    println("Çalışıyor mu : ${bmw.calisiyorMu}")*/

    //Veri Atama
    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(40)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz",100,true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(40)
    sahin.bilgiAl()

}