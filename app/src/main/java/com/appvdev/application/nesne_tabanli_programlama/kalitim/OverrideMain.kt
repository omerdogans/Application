package com.appvdev.application.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() //Kalıtım yok kendi metodu
    memeli.sesCikar() //Kalıtım var üst sınıfın metoduna erişiyor
    kedi.sesCikar() //Kalıtım var ama kendi metodunu çalıştırıyor
    kopek.sesCikar()//Kalıtım var ama kendi metodunu çalıştırıyor

}