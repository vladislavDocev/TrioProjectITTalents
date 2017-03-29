package homeWork1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		float sum, dif, prod, res, div;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:\n");
		float a = sc.nextFloat();

		System.out.println("Enter b:\n");
		float b = sc.nextFloat();

		sum = a + b;
		dif = a - b;
		prod = a * b;
		res = a % b;
		div = a / b;
		System.out.println("The sum of a and b is :" + " " + sum + " "
				+ "the difference is" + " " + dif + " " + "the product is :"
				+ " " + prod + " " + " " + "the division residue is :" + " "
				+ res + " " + " " + "and the division is :" + " " + div + " ");

	}

}
