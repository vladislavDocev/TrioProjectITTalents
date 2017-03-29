package homeWork3;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[10];

		for (int j = 0; j < array1.length; j++) {
			System.out.println("Enter element of array1[" + j + "]");
			array1[j] = sc.nextInt();
		}

		int array2[] = new int[10];

		for (int j = 0; j < array2.length; j++) {
			System.out.println("Enter element of array2[" + j + "]");
			array2[j] = sc.nextInt();
		}
		int array3[] = new int[10];

		for (int i = 0; i < array2.length; i++) {
			if (array1[i] > array2[i]) {
				array3[i] = array1[i];
			} else {
				array3[i] = array2[i];
			}
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		} // 18,19,32,1,3, 4, 5, 6, 7, 8
			// 1, 2, 3,4,5,16,17,18,27,11
			// 
			// 18,19,32 ,4,5,16,17,18,27,11

	}

}