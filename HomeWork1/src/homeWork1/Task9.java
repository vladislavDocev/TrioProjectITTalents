package homeWork1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first 2-digit number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second 2-digit number:");
		int n2 = sc.nextInt();
		if (((n1 < 10) || (n1 > 99)) || ((n2 < 10) || (n2 > 99))) {
			System.out
					.println("Please enter a number in the range of [10;99] ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		} else {
			int d1 = n1 * n2;
			int d2 = d1 % 10;
			if (d2 % 2 == 0) {
				System.out.println(d1 + " " + d2 + " " + "is an even number");
			} else {
				System.out.println(d1 + " " + d2 + " " + "is an odd number");
			}

		}

	}

}
