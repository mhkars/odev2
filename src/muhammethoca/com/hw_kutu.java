package muhammethoca.com;

import java.util.Scanner;

public class hw_kutu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("boyut seciniz");
		int x = scanner.nextInt();
		int y = (x * x);
		int l = (x * x) / 2;

		while (true) {

			for (int i = 0; i < y; i++) {
				if (i == l) {
					System.out.print("*" + "   ");
					if ((i + 1) % x == 0) {
						System.out.println("\n");
					}
				} else {
					System.out.print("." + "   ");
					if ((i + 1) % x == 0) {
						System.out.println("\n");
					}
				}
			}

			System.out.println("2,4,6,8 tuslariyla yildizi hareket ettirini");
			int move = scanner.nextInt();

			if (move == 2) {
				if (l > (y - x)) {
					l = l - (x * (x - 1));
				} else {
					l = l + x;
				}
			} else if (move == 8) {
				if (l < x) {
					l = l + (x * (x - 1));
				} else {
					l = l - x;
				}
			} else if (move == 4) {
				if ((l + 1) % x == 1) {
					l = l + (x - 1);
				} else {
					l = l - 1;
				}
			} else if (move == 6) {
				if ((l + 1) % x == 0) {
					l = l - (x - 1);
				} else {
					l = l + 1;
				}
			}

		}

	}
}
