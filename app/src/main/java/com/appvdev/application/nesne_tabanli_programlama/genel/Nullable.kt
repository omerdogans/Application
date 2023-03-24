package com.appvdev.application.nesne_tabanli_programlama.genel

fun main() {
    //Nullable, Null safety , Optional(Swift)
    //Null,NaN,nil

    //Tanımlama Aşaması
    //Değeri olmayan değşken oluşturamyıyoruz
    var mesaj:String? = null //mesaj null olabilir dikkatli ol

    mesaj = "Merhaba"
    //Kulanma Aşaması

    //Yöntem 1
    println("Yöntem 1 : ${mesaj?.trim()}")//trim() whitespacee başında ve sonunda yer alan boşlukları siler.
    //Soru işareti burada sorun olursa hata vermeyecek, sorun yoksa çalışacak

    //Yöntem 2
    //println("Yöntem 2 : ${mesaj!!.trim()}") //Sorumluluk bizde , sorun olursa uygulama çöker, ben koduma güveniyorum sorun olmyacak

    //Yöntem 3
    if (mesaj != null){
        println("Yöntem 3 : ${mesaj.trim()}")
    }else{
        println("Yöntem 3 : Sonuç nulldur")
    }

    //Yöntem 4
    mesaj?.let { // = if (mesaj != null)
        println("Yöntem 4 : ${it.trim()}")
    }

}