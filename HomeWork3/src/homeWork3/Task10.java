package homeWork3;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		int avg = 0;
		int bestDifferenceFoundYet = Integer.MAX_VALUE;
		int desiredElement = 0;
		int diff=0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element array[" + i + "]");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			avg += array[i];
		}
		avg = avg / 7;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == avg) {
				desiredElement=array[i];
				break;
			} else {
				if (avg < array[i]) {
					diff = array[i] - avg;
				} else {
					diff = avg - array[i];
				}
					if (diff < bestDifferenceFoundYet) {
						bestDifferenceFoundYet = diff;
						desiredElement = array[i];
					}
				
			}

		}
		
		System.out.println("avg is " + avg + ", closest element is "
				+ desiredElement);

	}

}
