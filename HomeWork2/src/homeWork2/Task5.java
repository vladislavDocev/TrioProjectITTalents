package homeWork2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 =sc.nextInt();
		System.out.println("Enter second number:");
		int n2 =sc.nextInt();
		if(n1<n2) {
			for(int i=n1;i<=n2;i++){
				System.out.println(i);
			}
		}
		else {
			for(int i=n2;i<=n1;i++){
				System.out.println(i);
			}
		}
	}

}
