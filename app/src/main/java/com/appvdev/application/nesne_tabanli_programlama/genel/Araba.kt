package com.appvdev.application.nesne_tabanli_programlama.genel

//parantez olan alan constructor
class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {

    //Baslangıc Metodu bu class da başka sınıfta kullanmak için
    init {//Constructor anlamına gelir
        println("Araba sınıfından nesne oluşturuldu")
    }

    fun calistir() {//Bu fonksiyon ile classın değelerini değiştiriyorsak, Side Effect (Yan Etki)
        calisiyorMu = true
        hiz = 5
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm: Int) {
        hiz += kacKm// hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz -= kacKm
    }

    fun bilgiAl() {
        println("-------------------------")
        println("Renk         : ${renk}")
        println("Hız          : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
    }

}