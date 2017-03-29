package homeWork2;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int i = 1;
		int mult = 1;

		do {
			System.out.print(i + " * ");
			mult = mult * i;
			i++;
		} while (i <= n);
		System.out.println(" = " + mult);

	}

}
