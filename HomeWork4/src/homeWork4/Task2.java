package homeWork4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows=cols of the matrix:");
		int rows = sc.nextInt();
		int cols = rows;
		int matrix[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter element at [" + i + "]" + "["
						+ j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println("\nAntidiagonal:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i + j == rows - 1) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}

	}

}
