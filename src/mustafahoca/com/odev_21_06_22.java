package mustafahoca.com;

import java.util.Scanner;

public class odev_21_06_22 {

	static Scanner scanner = new Scanner(System.in);
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	static String[] sesli = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };

	public static void main(String[] args) {
//		plaka("Ankara", "Adana", "Afyon");
//		il();
		String[] yeni_iller = sessiz();
//		kısalt(yeni_iller); 
		Byazdir(yeni_iller);
		Ayazdir(iller);
	}

//	public static void il() {
////		System.out.println("Harf giriniz ....:");
////		Scanner scanner = new Scanner(System.in);
////		String harf = scanner.nextLine();
//		for (int i = 0; i < iller.length; i++) {
////			if (harf.equalsIgnoreCase(iller[i].substring(0, 1))) {
//			if (i < 9) {
//				System.out.println("0" + (i + 1) + "-" + iller[i]);
//			} else {
//				System.out.println((i + 1) + "-" + iller[i]);
//			}
//		}
////	}
//	public static void plaka(String... ill) {
////		System.out.println("Il giriniz...: ");
////		String il = scanner.nextLine();
//		for (String il : ill) {
//			for (int i = 0; i < iller.length; i++) {
//				if (il.equalsIgnoreCase(iller[i])) {
//					if (i < 9)
//						System.out.println(il + " plakasi: 0" + (i + 1));
//					else {
//						System.out.println(il + " plakasi " + (i + 1));
//					}
//				}
//			}
//
//		}
//	}

	public static void kısalt(String[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].length() < 3)
				System.out.println(dizi[i] + "...");
			else {
				System.out.println(dizi[i].substring(0, 3) + "...");
			}

		}
	}

	public static String[] sessiz() {
		String[] sesli = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] yeni_iller = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < (sesli.length); j++) {

				if (iller[i].contains(sesli[j])) {
					iller[i] = iller[i].replace(sesli[j], "");
				}

			}
			yeni_iller[i] = iller[i];

		}
		return yeni_iller;

	}

	public static void Byazdir(String[] dizi) {
		int a = 1;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].startsWith("B")) {
				if (dizi[i].length() < 3)
					System.out.println(a + "-" + dizi[i]);
				else {
					System.out.println(a + "-" + dizi[i].substring(0, 3));
				}
				a++;

			}
		}

	}

	public static void Ayazdir(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].charAt(1) == 'a') {
				System.out.println(dizi[i].substring(0, 3).toUpperCase());
			}
		}
	}
}
