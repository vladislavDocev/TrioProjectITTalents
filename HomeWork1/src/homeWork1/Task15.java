package homeWork1;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number[0;24]");
		int h = sc.nextInt();
		if (h < 0 || h > 24) {
			System.out.println("Please enter a number[0;24]");
			h = sc.nextInt();
		} else {
			if (h >= 18 && h <= 4) {
				System.out.println("Good Evening");
			} else if (h <= 9 && h > 4) {
				System.out.println("Good Morning");
			} else if (h < 18 && h > 9) {
				System.out.println("Good Day");
			}
		}

	}

}
