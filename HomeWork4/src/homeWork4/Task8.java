package homeWork4;

public class Task8 {

	public static void main(String[] args) {
		int matrix[][]= { {1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}
						};
		int matrix2[][]= new int[4][4];
				
		
		for (int k = 0; k < matrix.length; k++) {
			int row=0;
			for (int j = matrix.length-1; j >=0; j--) {
				matrix2[k][row]=matrix[j][k];
				row++;
			}
			
		}
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(matrix2[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
