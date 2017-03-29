package homeWork2;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side[3;20]:");
		int n = sc.nextInt();
		System.out.println("Enter symbol:");
		String s = sc.next();
		if(n<3 || n>20) {
			System.out.println("Enter side[3;20]:");
			n = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {

			if (i >= 2 && i < n) {
				System.out.print("*");
				for (int k = 1; k <= n - 2; k++) {
					System.out.print(s);
				}
				System.out.print("*");
			} else {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
