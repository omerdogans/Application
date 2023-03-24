package com.appvdev.application

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //var x:String
    var y:String? = null

    lateinit var z:String //başka zaman initilaze edeceğim, yani değer aktaracağım demek
    //val koyamıyoruz çünkü lateinitin yapısına aykırı lateinit hep var ile kullanılır

    //Primitif tip Int, Long, double, boolean lateinit var kullanamayız
    var sayi:Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        z = "Hello"

        Color.GRAY //Enum verilen o sistemdeki altyapıyı sağlayan sisem

    }
}