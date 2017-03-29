package homeWork5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1 = sc.next();
		System.out.println("Enter second string:");
		String string2 = sc.next();

		if (string1.length() == string2.length()) {
			System.out.println("Strings have the same size\n");
			
			for (int i = 0; i < string1.length(); i++) {
				if (string1.charAt(i) != string2.charAt(i)) {
					System.out.println((i + 1) + " " + string1.charAt(i) + "-"
							+ string2.charAt(i));
				}
			}
		} else {
			System.out.println("Strings have different sizes\n");
		}
		

	}

}
