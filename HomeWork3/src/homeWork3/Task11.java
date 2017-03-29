package homeWork3;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
