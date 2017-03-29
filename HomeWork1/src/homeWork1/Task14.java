package homeWork1;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of the first position[1;8]:");
		int c1 = sc.nextInt();
		System.out.println("Enter coordinates of the first position[1;8]:");
		int c2 = sc.nextInt();
		System.out.println("Enter coordinates of the second position[1;8]:");
		int c3 = sc.nextInt();
		System.out.println("Enter coordinates of the second position[1;8]:");
		int c4 = sc.nextInt();

		if (c1 < 1 || c1 > 8 || c2 < 1 || c2 > 8 || c3 < 1 || c3 > 8 || c4 < 1
				|| c4 > 8) {
			System.out.println("Enter coordinates in the range of [1;8]:");
			System.out.println("Enter coordinates of the first position[1;8]:");
			c1 = sc.nextInt();
			System.out.println("Enter coordinates of the first position[1;8]:");
			c2 = sc.nextInt();
			System.out
					.println("Enter coordinates of the second position[1;8]:");
			c3 = sc.nextInt();
			System.out
					.println("Enter coordinates of the second position[1;8]:");
			c4 = sc.nextInt();
		} else {
			if ((c1 % 2 != 0 && c2 % 2 != 0) && (c3 % 2 == 0 && c4 % 2 == 0)) {
				System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
						+ "Share the same color ");
			} else if ((c1 % 2 == 0 && c2 % 2 == 0)
					&& (c3 % 2 == 0 && c4 % 2 == 0)) {
				System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
						+ "Share the same color ");
			} else if ((c1 % 2 != 0 && c2 % 2 != 0)
					&& (c3 % 2 != 0 && c4 % 2 != 0)) {
				System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
						+ "Share the same color ");
			} else {
				System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
						+ "Share the same color ");
			}
		}
		if ((c1 % 2 != 0 && c2 % 2 == 0) && (c3 % 2 == 0 && c4 % 2 == 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 == 0 && c2 % 2 != 0) && (c3 % 2 == 0 && c4 % 2 == 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 == 0 && c2 % 2 == 0) && (c3 % 2 != 0 && c4 % 2 == 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 == 0 && c2 % 2 == 0) && (c3 % 2 == 0 && c4 % 2 != 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 != 0 && c2 % 2 == 0) && (c3 % 2 != 0 && c4 % 2 == 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Share the same color ");
		} else if ((c1 % 2 != 0 && c2 % 2 == 0) && (c3 % 2 == 0 && c4 % 2 != 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 == 0 && c2 % 2 != 0) && (c3 % 2 != 0 && c4 % 2 == 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Dont share the same color ");
		} else if ((c1 % 2 == 0 && c2 % 2 != 0) && (c3 % 2 == 0 && c4 % 2 != 0)) {
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " "
					+ "Share the same color ");
		}

	}

}
