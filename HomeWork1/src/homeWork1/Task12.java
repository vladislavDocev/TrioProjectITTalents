package homeWork1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day:");
		int day = sc.nextInt();

		System.out.println("Enter month:");
		int month = sc.nextInt();

		System.out.println("Enter year:");
		int year = sc.nextInt();

		if ((day > 30) || (month > 12)) {
			System.out.println("Enter correct date:");
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			sc.close();
		} else {
			if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
				if (day > 28) {
					if (month > 11) {
						System.out.println((day = 1) + " " + (month = 1) + " "
								+ ++year);
					} else {
						System.out.println((day = 1) + " " + ++month + " "
								+ year);
					}
			 }  else if (day<=27){
					System.out.println(++day + " " + month + " " + year);
				}
			 else if ((year % 400 != 0) && (year % 100 == 0)) {
					if (day > 29) {
						if (month > 11) {
							System.out.println((day = 1) + " " + (month = 1)
									+ " " + ++year);
						} else {
							System.out.println((day = 1) + " " + ++month + " "
									+ year);
						}
					} else if (day<=28){
						System.out.println(++day + " " + month + " " + year);
					}
				}
			}
		}
	}
}
