package homeWork1;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in celsius[-100;100]:");
		int t = sc.nextInt();
		if ((t < -100) || (t > 100)) {
			System.out.println("Enter temperature in celsius[-100;100]:");
		} else {
			if (t < -20) {
				System.out.println(t + " Degrees is Freezing cold");
			} else if ((t <= 0) && (t >= -20)) {
				System.out.println(t + " Degrees is Cold ");
			} else if ((t <= 15) && (t > 0)) {
				System.out.println(t + " Degrees is Chilly ");
			} else if ((t <= 25) && (t > 15)) {
				System.out.println(t + " Degrees is Warm ");
			} else {
				System.out.println(t + " Degrees is Hot ");
			}
		}

	}

}
