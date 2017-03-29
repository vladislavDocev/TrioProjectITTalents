package homeWork5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names:");
		String string1 = sc.nextLine();
		String string2="";
		String string3="";
		int ascii1=0;
		int ascii2=0;
		int separator=string1.indexOf(",");
		
		for (int i = 0; i < string1.length(); i++) {
			if(i<separator) {
				string2+=string1.charAt(i);
				ascii1+=string1.charAt(i);
			}
			if(i>separator) {
				string3+=string1.charAt(i);
				ascii2+=string1.charAt(i);
			}
		}
		if(ascii1>ascii2) {
			System.out.println(string2);
		}
		else {
			System.out.println(string3);
		}

	}

}
