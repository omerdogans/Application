package com.appvdev.application.nesne_tabanli_programlama.composition

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")


    val y1 = Yonetmenler(1,"Christoper Nolan")
    val y2 = Yonetmenler(2,"Quentein Tarantino")

    val f1 = Filmler(1,"Django",2013,k1,y2) // işte bu composition
    val f2 = Filmler(1,"Django",2013,k2,y1)

    println("Film id  : ${f1.film_id}")
    println("Film ad  : ${f1.film_ad}")
    println("Film yıl : ${f1.film_yil}")
    println("Film kategori : ${f1.kategori.kategori_ad}")
    println("Film yönetmen : ${f1.yonetmen.yonetmen_ad}")


}