package com.cigdemkocak.trendyoltasarimclone
import java.io.Serializable
data class Urunler(var urunId:Int,
                   var urunAdi: String,
                   var urunResimAdi:String,
                   var urunFiyati: Double) : Serializable {
}