package homeWork6;

import java.util.Scanner;

public class FourPairs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int countPairs=0;
		int countTries=0;
		
		while(true) {
			System.out.println("Enter 5 cards: ");
			String cards=sc.nextLine();
			String card[] = cards.split(" ");
			boolean thereIsPair=false;
			outerloop:
			for (int i = 0; i < card.length; i++) {
				if(card[i].equals("2")||card[i].equals("3")||card[i].equals("4")||card[i].equals("5")
						||card[i].equals("6")||card[i].equals("7")||card[i].equals("8")||card[i].equals("9")
						||card[i].equals("T")||card[i].equals("J")||card[i].equals("Q")||card[i].equals("K")
						||card[i].equals("A")) {
				int idx=i+1;
				while(idx<card.length) {
					
					if(card[i].equals(card[idx])) {
						countPairs++;
						thereIsPair=true;
						break outerloop;
					}
					
					idx++;
				}
				}
				else {
					System.out.println("Wrong input");
					countTries--;
					thereIsPair=true;
				}
			}
			if(thereIsPair==false) {
				countPairs=0;
			} 
			countTries++;
			if(countPairs==4) {
				System.out.println(countTries);
				break;
			}
			
			
		}
	}

}
