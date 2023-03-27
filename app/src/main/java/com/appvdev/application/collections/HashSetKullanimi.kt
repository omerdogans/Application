package com.appvdev.application.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)

    for (m in meyveler){
        println("Sonuç 1: $m")
    }

    for ((i,m) in meyveler.withIndex()){
        println("$i -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}