package homeWork5;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of the matrix:");
		int n = sc.nextInt();
		System.out.println("Enter cols of the matrix:");
		int m = sc.nextInt();
		int matrix[][] = new int[n][m];
		int nm = n * m;
		int cnt = 1;

		System.out.println("First");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = cnt++;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Second");
		cnt = 1;
		for(int i=0;cnt<=n*m;i++) { // 0 1  1 5  2 10  3 15  4 20
			int row=0;
			int col=i;
			while(row<n){
				//if(row<n && col<m) {
					matrix[row][col]=cnt;
					cnt++;
			//	}
				row++;
				}
		}
		/* Second way 
	    	for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
				matrix[j][i] = cnt++;
			}
		} */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Third");
		int number = 1;
		for (int i = 0; number <= n * m; i++) {
			// start each diagonal at the top row and from the right
			int row = i;
			int col = 0;

			do {
				// make sure row and length are within the bounds of the matrix
				if (row < n && col < m) {
					matrix[row][col] = number;
					number++;
				}

				// we decrement row while incrementing row in order to traverse
				// down and left
				row--;
				col++;
			} while (row >= 0);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Fourth");

		number = 1;
		int row = 0;
		for (int i = 0; number <= n * m; i++) {
			int col = i;
			if (col % 2 == 0) {
				row = 0;
				while (row < n) {
					if (row < n && col < m) {
						matrix[row][col] = number;
						number++;
					}
					row++;
				}
			} else if (col % 2 != 0) {
				row = n - 1;
				while (row >= 0) {
					if (row < n && col < m) {
						matrix[row][col] = number;
						number++;
					}
					row--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
