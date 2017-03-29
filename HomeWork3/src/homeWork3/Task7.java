package homeWork3;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array1:");
		int array1[] = new int[sc.nextInt()];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Please enter element array1[" + i + "]");
			array1[i] = sc.nextInt();
		}
		int[] array2 = new int[array1.length];

		for (int i = 0; i < array2.length; i++) {
			if (i == 0 || i == array2.length - 1) {
				array2[i] = array1[i];
			} else {
				array2[i] = array1[i - 1] + array1[i + 1];
			}
		}
		System.out.println("First Array:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\nSecond Array:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
