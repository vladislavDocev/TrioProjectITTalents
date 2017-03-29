package homeWork5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1=sc.next();
		System.out.println("Enter second string:");
		String string2=sc.next();
		
		String string3=string2.substring(0, 5) + string1.substring(5);
		
			if(string1.compareTo(string2)>0) {
		System.out.println(string1.length() + " " + string3);
			}
			else {
				System.out.println(string2.length() + " " + string3);
			}

	}

}
