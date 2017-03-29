package homeWork2;

public class Task13 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int d1 = i / 100;
			int d2 = i / 10 % 10;
			int d3 = i % 10;
			if (d1 == d2 || d2 == d3 || d1 == d3) {
				continue;
			}

			System.out.println(i);

		}

	}

}
