package homeWork5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1 = sc.next();
		System.out.println("Enter second string:");
		String string2 = sc.next();
		boolean contains = false;
		int containsOn1 = 0;
		int containsOn2 = 0;

		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (string2.charAt(j) == string1.charAt(i)) {
					contains = true;
					containsOn1 = i;
					containsOn2 = j;
					break;
				}

			}

		}
		if (contains) {
			for (int j2 = 0; j2 < string1.length(); j2++) {
				if (j2 == containsOn1) {
					for (int i = 0; i < string2.length(); i++) {

						System.out.print(string2.charAt(i));

					}
					System.out.println();
				} else {
					for (int i2 = 0; i2 < containsOn2; i2++) {
						System.out.print(" ");
					}
					System.out.print(string1.charAt(j2));
					System.out.println();
				}
			}
		} else {
			System.out.println("Strings dont have common element");
		}
	}

}
