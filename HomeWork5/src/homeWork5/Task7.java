package homeWork5;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String string1 = sc.nextLine();
		String string2 = null;
		int nextSpace = string1.indexOf(' ');
		int br = 0;
		int maxLength = 0;
		
		for (int i = 0; i < string1.length(); i++) {
			if(i==0) {
				string2=string1.substring(0, nextSpace);
				br++;
				maxLength=string2.length();
				}
			else {
				if(nextSpace!=string1.lastIndexOf(' ')) { // edno dve tri
				string2=string1.substring(nextSpace+1,string1.indexOf(' ',nextSpace+1));
				nextSpace=string1.indexOf(' ', nextSpace+1);
				br++;
				if(string2.length()>maxLength) {
					maxLength=string2.length();
				}
				
				}
				else {
					string2=string1.substring(nextSpace+1);
					br++;
					if(string2.length()>maxLength) {
						maxLength=string2.length();
					}
					break;
				}
			}
		}
		System.out.println(br + " Max length is: " + maxLength);

	}

}
