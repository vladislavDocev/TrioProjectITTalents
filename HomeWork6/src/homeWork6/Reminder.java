package homeWork6;

public class Reminder {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			for (int k = i; k <= 10; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
