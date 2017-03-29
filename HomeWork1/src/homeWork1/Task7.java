package homeWork1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter hour:");
		int hour = sc.nextInt();

		System.out.println("Enter money:");
		float money = sc.nextFloat();

		System.out.println("Enter true or false for value healthy:");
		boolean healthy = sc.nextBoolean();
		 
			if ((healthy == false) && (money > 10)) {
				System.out
						.println("I wont go out, but I will buy me some meds");
			} else if ((healthy == false) && (money < 10)) {
				System.out
						.println("I wont go out, and since I have no money I will just stay home and drink some tea");
			} else if ((healthy == true) && (money > 10)) {
				System.out
						.println("Im healthy and I will go see a movie with my friends");
			} else if ((healthy == true) && (money < 10)) {
				System.out.println("I will go drink coffe");
			}
		} 
		
	}


