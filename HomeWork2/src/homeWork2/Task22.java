package homeWork2;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number[1;999]:");
		int n = sc.nextInt();
		int i = 0;

		if (n < 1 || n > 999) {
			System.out.println("Enter number[1;999]:");
			n = sc.nextInt();
		}

		while (i < 10) {
			n++;
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				i++;
				System.out.println(i + ":" + n);
			}

		}

	}

}
