package homeWork1;

import java.util.Scanner;

public abstract class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 3-digit number that does not contain the digit '0':");
		int n = sc.nextInt();
		int d1 = n/100;
		int d2 = n%100/10;
		int d3 = n%10;
		if ((d1==0) || (d2==0) || (d3==0)) {
	    System.out.println("Enter a 3-digit number that does not contain the digit '0':");
	    n = sc.nextInt();
		} 
		else {
			if ((n%d1==0) && (n%d2==0) && (n%d3==0)) {
				System.out.println("The number " + n + " is divided by " + d1 + " " + d2 + " " + d3);
			}
			else if ((n%d1!=0) && (n%d2!=0) && (n%d3!=0)) {
				System.out.println("The number " + n + " is not divided by " + d1 + " " + d2 + " " + d3);
			}
			else if ((n%d1==0) && (n%d2!=0) && (n%d3!=0)) {
				System.out.println("The number " + n + " is divided by " + d1);
			}
			else if ((n%d1!=0) && (n%d2==0) && (n%d3!=0)) {
				System.out.println("The number " + n + " is divided by "  + d2);
			}
			else if ((n%d1!=0) && (n%d2!=0) && (n%d3==0)) {
				System.out.println("The number " + n + " is divided by" + " " + d3);
			}
			else if ((n%d1==0) && (n%d2==0) && (n%d3!=0)) {
				System.out.println("The number " + n + " is divided by " + d1 + " " + d2);
			}
			else if ((n%d1==0) && (n%d2!=0) && (n%d3==0)) {
				System.out.println("The number " + n + " is divided by " + d1 + " " + d3);
				
			}
			else if ((n%d1!=0) && (n%d2==0) && (n%d3==0)) {
				System.out.println("The number " + n + " is divided by "  + d2 + " " + d3);
			}
		}
	}

}
