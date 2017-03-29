package homeWork2;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number[1;51]:");
		int n = sc.nextInt();
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace" };

		for (int i = n-1 ; i <= 51; i++) {
			String suit = suits[i % 4];
			String rank = ranks[i / 4];
			System.out.println(rank + " of " + suit);
		}
	}

}
