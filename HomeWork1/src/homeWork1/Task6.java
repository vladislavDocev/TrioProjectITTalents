package homeWork1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		float a = sc.nextFloat();

		System.out.println("Enter b:");
		float b = sc.nextFloat();
		
		System.out.println("Enter c:");
		float c = sc.nextFloat();

		float temp = a;
		float temp2 = c;
		a = b;
		b = temp2;
		c = temp;
		
		System.out.println("The swapped value of a is:" + " " + a + " "
				+ ",the swapped value of b is:" + " " + b + ",the swapped value of c is:" + " " + c);
	}

}
