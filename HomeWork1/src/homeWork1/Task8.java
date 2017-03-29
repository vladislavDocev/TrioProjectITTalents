package homeWork1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number [1000;9999]:");
		int n = sc.nextInt();

		int d1;
		int d2;
		int d3;
		int d4;
		if ((n < 1000) || (n > 9999)) {
			System.out
					.println("Please enter a number in the range of [1000;9999] ");
			n = sc.nextInt();
		} else {
			int digit1;
			int digit2;

			d1 = n / 1000;
			d2 = n % 1000 / 100;
			d3 = n % 100 / 10;
			d4 = n % 10;
			digit1 = d1 * 10 + d4;
			digit2 = d2 * 10 + d3;
			if (digit1 > digit2) {
				System.out.println(digit1 + " > " + digit2);
			} else if(digit1 == digit2) {
				System.out.println(digit1 + " = " + digit2);
			} else {
				System.out.println(digit2 + " > " + digit1);
			}

		}
	}

}
