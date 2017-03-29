package homeWork3;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int array[] = new int[sc.nextInt()];
		int first = array[0];
		boolean isZigZag = false;

		for (int j = 0; j < array.length; j++) {
			System.out.println("Enter element [" + j + "]");
			array[j] = sc.nextInt();
		}
		for (int i = 1; i < array.length; i++) {
			if (i % 2 != 0) {
				if (array[i] > first) {
					isZigZag = true;
				} else {
					isZigZag = false;
				}
				first = array[i];
			} else {
				if (array[i] < first) {
					isZigZag = true;
				} else {
					isZigZag = false;
				}
				first = array[i];
			}
		}
		if (isZigZag == true) {
			System.out.println("Array is Zig-Zag");
		} else {
			System.out.println("Array is not Zig-Zag");

		}

	}

}