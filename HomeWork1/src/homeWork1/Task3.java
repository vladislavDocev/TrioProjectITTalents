package homeWork1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		float a = sc.nextFloat();

		System.out.println("Enter b:");
		float b = sc.nextFloat();

		float c = a;
		a = b;
		b = c;
		System.out.println("The swapped value of a is:" + " " + a + " "
				+ ",and the swapped value of b is:" + " " + b);

	}

}
