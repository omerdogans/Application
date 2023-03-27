package com.appvdev.application.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSaray = Saray(6,200)
    val bogazVilla = Villa(true,30)

    println(topkapiSaray.kuleSayisi)
    println(topkapiSaray.pencereSayisi)

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    //Type control : Tip kontrol
    if(topkapiSaray is Saray){
        println("Saraydır")
    }else{
        println("Saray Değildir")
    }

    //Upcasting Alttan üste dönüştürme
    val ev:Ev = Saray(3,40)

    //Downcasting Üsten alta dönüştürme
    val myHome = Ev(10)
    val saray = myHome as Saray



}