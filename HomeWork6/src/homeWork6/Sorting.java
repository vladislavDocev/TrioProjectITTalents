package homeWork6;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int array[] = { 9, 12, 3, 5, 7, 1, 5 };

		BubbleSort(array);
		System.out.println(Arrays.toString(array));

		int array2[] = { 9, 12, 3, 5, 7, 1, 5 };
		SelectionSort(array2);
		System.out.println(Arrays.toString(array2));

		int array3[] = { 9, 12, 3, 5, 7, 1, 5 };
		CountingSort(array3);
		System.out.println(Arrays.toString(array3));

	}

	static void BubbleSort(int[] array) {
		int br = 0;
		for (int i = 0; i < array.length; i++) {
			boolean swap = false;
			for (int j = i + 1; j < array.length; j++) {
				br++;
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
		System.out.println("Iterations to complete BubbleSort: " + br);
	}

	static void SelectionSort(int[] array) {
		int br = 0;
		for (int i = 0; i < array.length / 2; i++) {
			int min = array[i];
			int minIndex = i;
			int max = array[i];
			int maxIndex = i;
			for (int j = i + 1; j < array.length - i; j++) {
				br++;
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
				if (max < array[j]) {
					max = array[j];
					maxIndex = j;
				}
			}
			int temp1 = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp1;

			int temp2 = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[maxIndex];
			array[maxIndex] = temp2;
		}
		System.out.println("Iterations to complete SelectionSort: " + br);

	}

	static void CountingSort(int[] array) {
		int br = 0;

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			br++;
			if (array[i] > max) {
				max = array[i];
			}
		}

		int[] helper = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			br++;
			helper[array[i]]++;
		}
		int originalIndex = 0;
		for (int i = 0; i < helper.length; i++) {
			for (int j = 0; j < helper[i]; j++) {
				br++;
				array[originalIndex] = i;
				originalIndex++;
			}
		}
		System.out.println("Iterations to complete CountingSort: " + br);
	}

}
