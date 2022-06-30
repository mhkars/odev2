package com.mustafahoca;

public class Test {

	public static void main(String[] args) {
		Urunler urunler = new Urunler();
		urunler.urun = new Urunler[1];

		Temizlik temizlik1 = new Temizlik();
		temizlik1.cildeZararlı = true;
		temizlik1.uygulamaAlanı = "Fayans";
		temizlik1.isim = "Kir Sokucu";
		temizlik1.fiyat = 50;
		temizlik1.sonKullanma = "30.06.2022";
		temizlik1.stok = 50;
		urunler.urun[0] = temizlik1;

		urunler.kampanya(urunler.urun[0].sonKullanma, urunler.urun[0].fiyat, urunler.urun[0].stok);
		Market.siparis(urunler.urun);

		Gıda gıda1 = new Gıda();
		gıda1.glutenFree = true;
		gıda1.kalori = 278;
		gıda1.isim = "Ekmek";
		gıda1.fiyat = 5;
		gıda1.sonKullanma = "29.06.2022";
		gıda1.stok = 10;
		urunler.urun[0] = gıda1;

		urunler.kampanya(urunler.urun[0].sonKullanma, urunler.urun[0].fiyat, urunler.urun[0].stok);
		Market.siparis(urunler.urun);

		Kozmetik kozmetik1 = new Kozmetik();
		kozmetik1.ciltTürü = "Hassas";
		kozmetik1.uygulamaBölgesi = "Vücut";
		kozmetik1.isim = "Gunes Kiremi";
		kozmetik1.fiyat = 100;
		kozmetik1.sonKullanma = "30.06.2023";
		kozmetik1.stok = 17;
		urunler.urun[0] = kozmetik1;

		urunler.kampanya(urunler.urun[0].sonKullanma, urunler.urun[0].fiyat, urunler.urun[0].stok);
		Market.siparis(urunler.urun);

	}

}
