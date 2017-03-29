package homeWork3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isMirror = false;

		System.out.println("Enter size of array:");
		int array[] = new int[sc.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] == array[array.length - 1 - i]) {
				isMirror = true;
			} else {
				isMirror = false;
				break;
			}
		}

		System.out.println(isMirror);

	}

}
