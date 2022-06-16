package muhammethoca.com;

import java.util.Scanner;

public class hw_3 {

	public static void main(String[] args) {

		System.out.println("Lutfen sorunuzu turkce karakter icermeyecek sekilde giriniz...:");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String first_num;
		String second_num;

		String new_sen = sentence.replaceAll("[^-0-9]+", " ").trim();

		int index = new_sen.indexOf(" ");

		first_num = new_sen.substring(0, index);
		second_num = new_sen.substring(index + 1, new_sen.length());

		int first_number = Integer.parseInt(first_num);
		int second_number = Integer.parseInt(second_num);

		if (sentence.contains("topla"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "+" + second_number + "=" + (first_number + second_number));
		else if (sentence.contains("fark"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "-" + second_number + "=" + (first_number - second_number));
		else if (sentence.contains("carp"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "*" + second_number + "=" + (first_number * second_number));
		else if (sentence.contains("bol"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "/" + second_number + "=" + (first_number / second_number));
	}
}
