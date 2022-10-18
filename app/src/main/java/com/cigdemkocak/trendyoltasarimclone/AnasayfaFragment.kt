package com.cigdemkocak.trendyoltasarimclone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.cigdemkocak.trendyoltasarimclone.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    private lateinit var viewPager2: ViewPager2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        viewPager2 = tasarim.imageSlider
        val sliderItems: MutableList<SliderItem> = ArrayList()
        sliderItems.add(SliderItem(R.drawable.image8))
        sliderItems.add(SliderItem(R.drawable.image4))


        viewPager2.adapter = SliderAdapter(sliderItems, viewPager2)

        val etiketListesi = ArrayList<Etiket>()
        val e0 = Etiket(" Keşfet")
        val e1 = Etiket("Kadın")
        val e2 = Etiket("Erkek")
        val e3 = Etiket("Çocuk")
        val e4 = Etiket("Elektronik")
        val e5 = Etiket("Kitap & Kırtasiye")
        etiketListesi.add(e0)
        etiketListesi.add(e1)
        etiketListesi.add(e2)
        etiketListesi.add(e3)
        etiketListesi.add(e4)
        etiketListesi.add(e5)

        tasarim.rvEtiket.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapter = EtiketAdapter(requireContext(),etiketListesi)
        tasarim.rvEtiket.adapter = adapter

        var urunListesi = ArrayList<Urunler>()
        val u1 = Urunler(1, "Logitech Mouse", "urun1",409.00)
        val u2 = Urunler(2, "Logitech Mouse", "urun2",499.00)
        val u3 = Urunler(3, "Philips Kulaklık", "urun3",200.00)
        val u4 = Urunler(3, "JBL Hoparlör", "urun4",1099.90)
        urunListesi.add(u1)
        urunListesi.add(u2)
        urunListesi.add(u3)
        urunListesi.add(u4)

        tasarim.rvUrun.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapter1 = UrunlerAdapter(requireContext(),urunListesi)
        tasarim.rvUrun.adapter = adapter1





        return tasarim.root
    }


}