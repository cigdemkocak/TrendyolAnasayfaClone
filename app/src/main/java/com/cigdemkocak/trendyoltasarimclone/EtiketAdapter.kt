package com.cigdemkocak.trendyoltasarimclone

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cigdemkocak.trendyoltasarimclone.databinding.EtiketTasarimBinding

class EtiketAdapter(var mContext:Context, var etiketListesi:List<Etiket>) :RecyclerView.Adapter<EtiketAdapter.CardTasarimTututcu>(){
    inner class CardTasarimTututcu(tasarim:EtiketTasarimBinding) :RecyclerView.ViewHolder(tasarim.root){
        var tasarim:EtiketTasarimBinding
        init{
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTututcu {
        val tasarim = EtiketTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTututcu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTututcu, position: Int) {
        val etiket = etiketListesi.get(position)
        val t = holder.tasarim
        t.textViewEtiket.text = "${etiket.etiket}"

        t.etiketCard.setOnClickListener {
            t.etiketCard.setCardBackgroundColor(Color.parseColor("#FF901A"))
            t.textViewEtiket.setTextColor(Color.WHITE)
        }
    }

    override fun getItemCount(): Int {
        return etiketListesi.size
    }


}