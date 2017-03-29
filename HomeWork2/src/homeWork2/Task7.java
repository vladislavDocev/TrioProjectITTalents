package homeWork2;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n of numbers that are divided by 3");
		int n = sc.nextInt();
		

		for (int i = 1; i <= n; i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(3*i + ",");
			}
		}

	}

}
