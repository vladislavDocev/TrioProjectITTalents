package homeWork1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:\n");
		float a = sc.nextFloat();

		System.out.println("Enter b:\n");
		float b = sc.nextFloat();

		System.out.println("Enter c:\n");
		float c = sc.nextFloat();
		sc.close();

		if (a < b) {

			if (c > a && c < b) {
				System.out.println("The number" + " " + c + " "
						+ "is between the numbers" + " " + a + "," + b);
			} else {
				System.out.println("The number" + " " + c + " "
						+ "is NOT between the numbers" + " " + a + "," + b);

			}

		} else {
			if (c < a && c > b) {
				System.out.println("The number" + " " + c + " "
						+ "is between the numbers" + " " + a + "," + b);
			} else {
				System.out.println("The number" + " " + c + " "
						+ "is NOT between the numbers" + " " + a + "," + b);

			}

		}
	}

}
