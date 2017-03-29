package homeWork2;

public class Task21 {

	public static void main(String[] args) {
		int condBegin = 0;
		int initBegin = 1;

		for (int i = 0; i <= 9; i++) {

			for (int j = initBegin; j <= 9; j++) {
				System.out.print(j);
			}
			for (int k = 0; k <= condBegin; k++) {
				System.out.print(k);
			}
			condBegin++;
			initBegin++;
			System.out.println();
		}

	}

}
