package homeWork5;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String string1 = sc.nextLine();

		int sum = 0;
		boolean isNeg = false;
		int res = 0;

		for (int i = 0; i < string1.length(); i++) {
			char c = string1.charAt(i);
			if (c < '0' || c > '9') {
				if (isNeg && res != 0) {
					res = -res;
					System.out.println(res);
					sum += res;
					res = 0;
				} else if (!isNeg && res != 0) {
					System.out.println(res);
					sum += res;
					res = 0;
				}
				if (c == '-') {
					isNeg = true;
				} else {
					isNeg = false;
				}

			}

			else if (c == '0') {
				System.out.println(c);
			} else {
				res = res * 10 + (c - '0');
			}

		}
		System.out.println("Sum is: " + sum);

	}

}
