package homeWork4;

public class Task5 {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }, };
		int row = 0;
		int col = 0;
		int maxRow = matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3];
		int maxCol = matrix[0][0] + matrix[1][0] + matrix[2][0] + matrix[3][0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				row += matrix[i][j];
				col += matrix[j][i];
			}
			if (row > maxRow) {
				maxRow = row;
			}
			if (col > maxCol) {
				maxCol = col;
			}
			row = 0;
			col = 0;
		}

		if (maxRow > maxCol) {
			System.out.println("Max sum of rows is: " + maxRow
					+ " Max sum of cols is: " + maxCol
					+ " Max rows is > Max cols");
		} else if (maxRow == maxCol) {
			System.out.println("Max sum of rows is: " + maxRow
					+ " Max sum of cols is: " + maxCol
					+ " Max rows is = Max cols");
		} else {
			System.out.println("Max sum of rows is: " + maxRow
					+ " Max sum of cols is: " + maxCol
					+ " Max rows is < Max cols");
		}

	}

}
