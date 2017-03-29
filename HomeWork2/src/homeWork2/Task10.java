package homeWork2;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		
		for(int i=2;i<a;i++) {
			if(a%i==0){
				System.out.println(a + " is not prime");
				break;
			}
			else {
				System.out.println(a + " is prime");
				break;
			}
		}
	}
	}/* Alternatively with boolean 
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i<a;i++) {
			if(a%i==0){
				prime=false;
				break;
			}
			
		}
		System.out.println(prime);
		}
		} */

	


