package homeWork3;

public class Task14 {

	public static void main(String[] args) {

		double[] array1 = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212,
				341, 1.2 };
		int counter = 0;
		int element = 0;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] >= -2.99 && array1[i] <= 2.99) {
				counter++; // So as to get the length of array2
			}
		}
		double[] array2 = new double[counter];

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] >= -2.99 && array1[i] <= 2.99) {

				array2[element] = array1[i];
				element++;

			}

		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
