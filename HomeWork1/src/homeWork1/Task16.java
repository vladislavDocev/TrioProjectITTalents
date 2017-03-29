package homeWork1;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number:");
		int n=sc.nextInt();
		if(n<100 || n>999) {
			System.out.println("Please enter a 3-digit number:");
		}
		else {
			int d1=n/100;
			int d2=n%100/10;
			int d3=n%10;
			if ((d1==d2) && (d2==d3)) {
			   System.out.println("Digits " + d1 + " " + d2 + " " +d3 + " of number " + n + " are equal");
			}
			else if((d1>d2) && (d2>d3)) {
				System.out.println("Digits " + d1 + " " + d2 + " " +d3 + " of number " + n + " are ascending");
			}
			else if((d1<d2) && (d2<d3)) {
				System.out.println("Digits " + d1 + " " + d2 + " " +d3 + " of number " + n + " are descending");
			}
			else {
				System.out.println("Digits " + d1 + " " + d2 + " " +d3 + " of number " + n);
			}
			
		}
			

	}
}
