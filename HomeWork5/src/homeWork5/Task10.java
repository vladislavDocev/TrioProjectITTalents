package homeWork5;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String string1 = sc.nextLine();
		String string2 =null;
		int asciiCode=0;
		
		for (int i = 0; i < string1.length(); i++) {
			asciiCode=string1.charAt(i);
			string2=String.valueOf(Character.toChars(asciiCode+5));
			System.out.print(string2);
			
		}

	}

}
