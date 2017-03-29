package homeWork2;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first digit[1;9]:");
		int d1 = sc.nextInt();
		System.out.println("Enter second digit[1;9]:");
		int d2 = sc.nextInt();

		if (d1 < 0 || d1 > 9 || d2 < 0 || d2 > 9) {
			System.out.println("Enter first digit[1;9]:");
			d1 = sc.nextByte();
			System.out.println("Enter second digit[1;9]:");
			d2 = sc.nextByte();
		}
		if (d1 > d2) {
			d1 = d1 + d2;
			d2 = d1 - d2;
			d1 = d1 - d2;
		}

		for (int i = 1; i <= d1; i++) {
			for (int j = 1; j <= d2; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

	}

}
