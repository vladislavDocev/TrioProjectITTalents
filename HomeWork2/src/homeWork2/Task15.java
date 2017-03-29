package homeWork2;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number[10;200]:");
		int n = sc.nextInt();
		if (n < 10 || n > 200) {
			System.out
					.println("Enter sum of the digits of the number you want[2;27]:");
			n = sc.nextInt();
		}

		for (int i = 200; i >= 10; i--) {
			if (i % 7 == 0 && i < n) {
				System.out.print(i + ",");
			}
		}

	}
}