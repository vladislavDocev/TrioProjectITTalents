package homeWork1;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the volume of the pool to fill[10;9999]:");
		int v = sc.nextInt();
		if ((v < 10) || (v > 9999)) {
			System.out
					.println("Please enter a number in the range of [10;9999] ");
			v = sc.nextInt();
		} else {
			int d1 = v / 5;
			int d2 = v % 5;
			if (d2 == 2) {
				System.out.println(++d1 + " Buckets of 2-litres\n" + --d1
						+ " Buckets of 3-litres\n");
			} else if (d2 == 3) {
				System.out.println(d1 + " Buckets of 2-litres\n" + ++d1
						+ " Buckets of 3-litres\n");
			} else if (d2 == 4) {
				System.out.println(d1 + " Buckets of 2-litres\n" + ++d1
						+ " Buckets of 3-litres\n" + "An additional bucket of "
						+ (d2 - 3) + " litres");
			} else if (d2 == 0) {
				System.out.println(++d1 + " Buckets of 2-litres\n" + d1
						+ " Buckets of 3-litres\n");
			} else {
				System.out.println(d1 + " Buckets of 2-litres\n" + d1
						+ " Buckets of 3-litres\n" + "An additional bucket of "
						+ d2 + " litres");
			}

		}
	}

}
