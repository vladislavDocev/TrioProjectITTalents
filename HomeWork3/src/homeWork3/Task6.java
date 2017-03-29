package homeWork3;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isMirror = false;

		System.out.println("Enter size of array1:");
		int array1[] = new int[sc.nextInt()];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Please enter element array1[" + i + "]");
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter size of array2:");
		int array2[] = new int[sc.nextInt()];

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Please enter element array2[" + i + "]");
			array2[i] = sc.nextInt();
		}

		if (array1.length == array2.length) {
			System.out.println("Arrays have the same size");
			for (int i = 0; i < array2.length; i++) {
				if (array1[i] == array2[i]) {
					isMirror = true;
				} else {
					isMirror = false;
					break;
				}
			}
			System.out.println("Equal arrays? - " + isMirror);
		} else {
			System.out.println("Arrays not same size and not equal");
		}

	}

}
