package homeWork1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		float a = sc.nextFloat();

		System.out.println("Enter b:");
		float b = sc.nextFloat();

		System.out.println("Enter c:");
		float c = sc.nextFloat();

		if ((a < b) && (b < c)) {
			System.out.println(c + " " + b + " " + a);

		} else if ((b < a) && (a < c)) {
			System.out.println(c + " " + a + " " + b);
		} else if ((c < a) && (a < b)) {
			System.out.println(b + " " + a + " " + c);
		} else {
			System.out.println(a + " " + b + " " + c);
		}
	}

}
