package homeWork2;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of the pyramide:");
		int n = sc.nextInt();
		int stars=1;
		int spaces=n-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			stars+=2;
			spaces--;
			System.out.println();
		}

	}

}
