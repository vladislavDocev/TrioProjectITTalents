package homeWork3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == 1) {
				array[i] = n;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
