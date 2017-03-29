package homeWork6;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		int[] arraySmall = { 5, 6, 7, 8, 9 };
		int[] arrayBig = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int[] newArray = ArrayConcat(arraySmall, arrayBig);
		System.out.println(Arrays.toString(newArray));
	}

	static int[] ArrayConcat(int[] firstArray, int[] secondArray) {
		int[] newArray = new int[firstArray.length + secondArray.length];
		for (int i = 0; i < newArray.length; i++) {
			if (i < firstArray.length) {
				newArray[i] = firstArray[i];
			} else {
				newArray[i] = secondArray[i - firstArray.length];
			}
		}

		return newArray;
	}

}
