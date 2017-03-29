package homeWork1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		float a = sc.nextFloat();

		System.out.println("Enter b:");
		float b = sc.nextFloat();
		if (a < b) {
			System.out.println(a + " " + b);

		} else {
			System.out.println(b + " " + a);
		}
	}

}
