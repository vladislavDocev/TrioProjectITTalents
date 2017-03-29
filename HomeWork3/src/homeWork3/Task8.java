package homeWork3;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int array[] = new int[sc.nextInt()]; // 1 1 1 0 3 3 3 3

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextInt();
		}

		int count = 0;
		int element = 0;
		for (int i = 0; i < (array.length - 1); i++) {
			int tempElement = array[i];
			int tempCount = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == tempElement) {
					tempCount++;
				}

			}
			if (tempCount > count) {
				element = tempElement;
				count = tempCount;

			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(element + " ");
		}

	}

}
