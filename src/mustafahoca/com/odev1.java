package mustafahoca.com;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose a dimension");
		int dimension = scanner.nextInt();
		System.out.println("choose an odd number");
		int max = scanner.nextInt();

		int average = (max + 1) / 2;
		int a = 1;
		for (int i = 0; i < dimension; i++) {
			System.out.print("\n");
			for (int j = 0; j < dimension; j++) {
				if (i == j)
					System.out.print(average + " ");
				else if (i < j)
					System.out.print(max + " ");
				else {
					System.out.print(a + " ");
				}

			}
		}
	}

}
