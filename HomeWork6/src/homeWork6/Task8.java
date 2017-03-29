package homeWork6;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get factorial:");
		int n = sc.nextInt();
		int result = fact(n);
		System.out.println(result);
	}

	static int fact(int n) {
		int result = 1;
		while (n >= 1) {
			result = result * n;
			n--;
		}
		return result;
	}

}
