package com.cigdemkocak.trendyoltasarimclone


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cigdemkocak.trendyoltasarimclone.databinding.CardTasarimBinding


class UrunlerAdapter(var mContext:Context,var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewUrun.setImageResource(mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        t.urunAdi.text = urun.urunAdi
        t.urunFiyat.text = "${urun.urunFiyati} ₺"

    }
    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}