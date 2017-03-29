package homeWork2;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n:");
		int n = sc.nextInt();
		int number=n-1;
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(number);
			}
			number+=2;
			System.out.println();
		}
	       
	}

	}

