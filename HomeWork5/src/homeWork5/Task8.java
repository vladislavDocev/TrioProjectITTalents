package homeWork5;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String string1 = sc.nextLine();
		char[] string2 = new char[string1.length()];
		int element = 0;
		boolean palindrom = true;

		for (int i = string1.length() - 1; i >= 0; i--) {
			string2[element] = string1.charAt(i);
			if (string2[element] != string1.charAt(element)) {
				palindrom = false;
			}
			element++;

		}
		if (palindrom) {
			System.out.println(string1 + " is palindrom");
		} else {
			System.out.println(string1 + " is not palindrom");
		}

	}

}
