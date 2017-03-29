package homeWork2;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number[10;30000]:");
		int n = sc.nextInt();
		int number = n;
		int digit = 0;

		if (n < 10 || n > 30000) {
			System.out.println("Enter number[10;30000]:");
			n = sc.nextInt();
		}

		do {

			digit = digit + n % 10;
			if (n >= 10) {
				digit = digit * 10;
			}
			n /= 10;

		} while (n > 0);
		System.out.println(digit);
		if (digit == number) {
			System.out.println(digit + "  is Palindrom");
		}

	}

}
