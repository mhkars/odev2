package com.mustafahoca;

public class Market {

	String isim;
	String sube;
	static int personelSayisi;
	String calismaSaatleri;

	public static void siparis(Urunler[] urun) {
		for (int i = 0; i < urun.length; i++) {
			if (urun[i].stok < 20) {
				System.out.println(urun[i].isim + " urunu staoklarda azalmistir. Siparis ediniz.");
			} else if (urun[i].stok > 100) {
				System.out.println(
						urun[i].isim + " urun staoklarda kalmıstır. Urunu satmak icin lutfen kampanyaya sokunuz");
			}

		}
	}
}
