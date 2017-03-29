package homeWork5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1=sc.next();
		System.out.println("Enter second string:");
		String string2=sc.next();
		
		System.out.println(string1.toUpperCase() + " " + string1.toLowerCase() + "\n" + string2.toUpperCase() + " " + string2.toLowerCase());;

	}

}
