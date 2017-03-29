package homeWork3;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int array[] = new int[sc.nextInt()]; // 1 1 1 0 3 3 3 3

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextInt();
		}
		System.out.println("Original array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		for (int i = 0 ; i < array.length/2; i++) { // 0 1 2  3 4 5 
			int temp=0;
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		
		System.out.println("\nReversed array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
