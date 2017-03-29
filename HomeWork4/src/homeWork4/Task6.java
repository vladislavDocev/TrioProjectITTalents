package homeWork4;

public class Task6 {

	public static void main(String[] args) {
		int matrix[][] = { { 11, 12, 13, 14, 15, 16, },
				{ 21, 22, 23, 24, 25, 26, }, { 31, 32, 33, 34, 35, 36, },
				{ 41, 42, 43, 44, 45, 46, }, { 51, 52, 53, 54, 55, 56, },
				{ 61, 62, 63, 64, 65, 66 } };
		int sumRow = 0;
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			if ((i + 1) % 2 == 0) {
				for (int j = 0; j < matrix[0].length; j++) {

					System.out.print(matrix[i][j] + " ");
					sumRow += matrix[i][j];

				}
				System.out.print(sumRow);
				System.out.println();
				sum += sumRow;
				sumRow = 0;
			}
		}
		System.out.println("The sum of elements is: " + sum);
	}	
}
