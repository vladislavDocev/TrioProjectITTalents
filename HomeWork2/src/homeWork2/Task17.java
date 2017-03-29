package homeWork2;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n[10;5555]:");
		int n = sc.nextInt();
		System.out.println("Enter number m[10;5555]:");
		int m = sc.nextInt();

		if (n < 10 || n > 5555 || m < 10 || m > 5555) {
			System.out.println("Enter number n[10;5555]:");
			n = sc.nextInt();
			System.out.println("Enter number m[10;5555]:");
			m = sc.nextInt();
		}
		if (n > m) {
			n = n + m;
			m = n - m;
			n = n - m;
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.print(i + ",");
			}
		}

	}

}
