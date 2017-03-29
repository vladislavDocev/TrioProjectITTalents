package homeWork3;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		double array[] = new double[sc.nextInt()];

		double max1 = Double.MIN_VALUE;
		double max2 = Double.MIN_VALUE;
		double max3 = Double.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {

			if (Math.abs(array[i]) > max1) {
				max3 = max2;
				max2 = max1;
				max1 = array[i];
			} else if (Math.abs(array[i]) > max2 && Math.abs(array[i]) != max1) {
				max3 = max2;
				max2 = array[i];
			} else if (Math.abs(array[i]) > max3 && Math.abs(array[i]) != max2
					&& Math.abs(array[i]) != max1) {
				max3 = array[i];
			}
		}
		System.out.print(max1 + " " + max2 + " " + max3);
	}

}
