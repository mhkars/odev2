package com.mustafahoca;

public class Urunler {

	static String isim;
	static double fiyat;
	static String sonKullanma;
	static int stok;
	Urunler[] urun;

	public static void kampanya(String date, double price, int stock) {
		if (date.endsWith("2022") && date.substring(3, 5).equals("06") && stok < 100) {
			price = price * (0.8);
			System.out.println(isim + " urunu %20 indirime girmistir. Kampanya stoklarla sinirlidir.");

		}

	}

}
