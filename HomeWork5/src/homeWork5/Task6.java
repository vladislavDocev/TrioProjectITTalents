package homeWork5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String string1 = sc.nextLine();
		String string2 = null;
		int nextElement = 0;

		for (int i = 0; i < string1.length(); i++) {
			if (i == 0) {
				string2 = string1.substring(0, 1).toUpperCase()
						+ string1.substring(1, string1.indexOf(' '));
				System.out.print(string2 + " ");
				nextElement = string1.indexOf(' ', 0);
			} else {

				if (nextElement != string1.lastIndexOf(' ')) {
					string2 = string1.substring(nextElement + 1,
							nextElement + 2).toUpperCase()
							+ string1.substring(nextElement + 2,
									string1.indexOf(' ', nextElement + 1));
					System.out.print(string2 + " ");
					nextElement = string1.indexOf(' ', nextElement + 1);
				} else {
					string2 = string1.substring(nextElement + 1,
							nextElement + 2).toUpperCase()
							+ string1.substring(nextElement + 2);
					System.out.println(string2 + " ");
					break;
				}

			}

		}
	}

}

