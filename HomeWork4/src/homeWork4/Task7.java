package homeWork4;

public class Task7 {

	public static void main(String[] args) {
		int matrix[][] = { { 11, 12, 13, 14, 15, 16, },
				{ 21, 22, 23, 24, 25, 26, }, { 31, 32, 33, 34, 35, 36, },
				{ 41, 42, 43, 44, 45, 46, }, { 51, 52, 53, 54, 55, 56, },
				{ 61, 62, 63, 64, 65, 66 } };
		int sumRow = 0;
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(matrix[i][j] + " ");
					sumRow += matrix[i][j];
				}

			}
			System.out.print("The sum of elements for row is: " + sumRow);
			System.out.println();
			sum += sumRow;
			sumRow = 0;
		}
		System.out.println("The sum of elements is: " + sum);

	}

}
