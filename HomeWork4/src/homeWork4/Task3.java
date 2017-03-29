package homeWork4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of the matrix:");
		int rows = sc.nextInt();
		System.out.println("Enter cols of the matrix:");
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];
		int sum = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter element at [" + i + "]" + "["
						+ j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum += matrix[i][j];
			}
		}

		System.out.println("Sum is: " + sum + " Average is: " + sum
				/ (rows * cols));

	}

}
