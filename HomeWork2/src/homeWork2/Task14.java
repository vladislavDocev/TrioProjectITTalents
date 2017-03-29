package homeWork2;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter sum of the digits of the number you want[2;27]:");
		int n = sc.nextInt();
		if (n < 2 || n > 27) {
			System.out
					.println("Enter sum of the digits of the number you want[2;27]:");
			n = sc.nextInt();
		}
		for (int i = 100; i <= 999; i++) {
			int d1 = i / 100;
			int d2 = i / 10 % 10;
			int d3 = i % 10;
			if (d1 + d2 + d3 == n) {
				System.out.print(i + ",");
			}
		}
	}

}
