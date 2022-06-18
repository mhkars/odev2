package mustafahoca.com;

import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a text");
		String text = scanner.nextLine();
		int total = 0;
		char temp;

		for (int i = 0; i < text.length(); i++) {
			temp = text.charAt(i);
			for (int j = 0; j < text.length(); j++) {
				if (temp == text.charAt(j) && temp != ' ') {
					total += 1;
				}
			}

			if (total > 1) {
				System.out.println("character " + text.charAt(i) + " accours " + total + " times");
			}
			text = text.replace(text.charAt(i), ' ');
			total = 0;
		}

	}
}
