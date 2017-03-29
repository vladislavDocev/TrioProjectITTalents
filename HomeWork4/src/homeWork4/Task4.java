package homeWork4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of the matrix:");
		int rows = sc.nextInt();
		System.out.println("Enter cols of the matrix:");
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter element at [" + i + "]" + "["
						+ j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = cols - 1; j >= 0; j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}

}
