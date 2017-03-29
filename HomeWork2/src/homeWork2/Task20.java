package homeWork2;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number[10;99]:");
		int n = sc.nextInt();

		if (n < 10 || n > 99) {
			System.out.println("Enter number[10;99]:");
			n = sc.nextInt();
		}

		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				System.out.print(n + " ");

			} else {
				n = (3 * n) + 1;
				System.out.print(n + " ");

			}

		}

	}

}
