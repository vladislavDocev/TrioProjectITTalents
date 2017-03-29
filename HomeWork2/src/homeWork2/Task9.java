package homeWork2;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter number b:");
		int b = sc.nextInt();
		int sum = 0;

		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		a++; // All numbers between a and b except them
		
		while (a < b) {

			if (a % 3 == 0) {
				System.out.print("skip " + a + ",");
			} else {
				System.out.print(a + "*" + a + " = " + a * a + ",");
				sum = sum + a * a;
			}
			a++;
			if (sum >= 200) {
				break;
			}
		}
		System.out.println();
		System.out.println("Sum is " + sum);

	}

}
