package com.appvdev.application.nesne_tabanli_programlama.paket1

open class A {

    //Acsess Modifier Değişim Tesleri
    var varsayilanDegisken = 1 //public : heryerden erişebilir
    public var publicDegisken = 2
    protected var protectedDegisken = 3 //Kalıtım yoluyla kullanılır class ın başına open yazıyoruz
    private var privateDegisken = 4 //Sadece bulunduğu classtan erişilir hiç bir zaman erişemeyiz

}