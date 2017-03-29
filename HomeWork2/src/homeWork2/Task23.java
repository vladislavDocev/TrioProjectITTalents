package homeWork2;

public class Task23 {

	public static void main(String[] args) {
		int d1 = 1;
		int d2 = 1;

		while (d1 <= 9) {

			while (d2 <= 9) {
				System.out.print(d1 + "*" + d2 + " ; ");
				d2++;
			}

			System.out.println();
			d1++;
			d2 = d1;
		}

	}

}

