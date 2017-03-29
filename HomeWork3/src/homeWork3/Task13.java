package homeWork3;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number to convert to binary:");
		int n = sc.nextInt();
		int array[] = new int[10];
		
		for (int i = array.length-1; i >= 0; i--) {
			array[i] = n%2;
			n/=2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		

	}

}
