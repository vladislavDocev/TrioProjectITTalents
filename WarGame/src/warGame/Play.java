package warGame;


public class Play {
	static final int IDX=0;
	public static Player p1 = new Player("Petko");
	public static Player p2 = new Player("Player 2");

	public static void main(String[] args) {
		
		Cards deck=new Cards();
		deck.shuffle();
		
		for (int i = 0; i < deck.deck.size(); i++) {
			System.out.println(deck.deck.get(i).card + " " + deck.deck.get(i).suite);
		}
		deck.dealCards(p1, p2);
		
		
		while(true) {
			
			if(p2.cards.size()<1) {
				if(p1.won == p2.won) {
					System.out.println("Equal score, " + p1.name + " has won " + p1.wonCards.size() + " cards,\n " + p2.name + " has won " + p2.wonCards.size() + " cards.");
					break;
				}
				else if(p1.won>p2.won) {
					System.out.println(p1.name + " Wins and has " + p1.wonCards.size() + " won cards,\n" + p2.name + " has won " + p2.wonCards.size() + " cards." );
				break;
				}
				else if(p2.won>p1.won) {
					System.out.println(p2.name + " Wins and has " + p2.wonCards.size() + " won cards,\n" + p1.name + " has won " + p1.wonCards.size() + " cards.");
					break;
					}
			}
			
			if(p1.cards.get(IDX).isGreater(p2.cards.get(IDX))) {
				p1.wonCards.add(p1.cards.get(IDX));
				p1.wonCards.add(p2.cards.get(IDX));
				p1.cards.remove(IDX);
				p2.cards.remove(IDX);
				p1.won+=2;
			}
			else if(p2.cards.get(IDX).isGreater(p1.cards.get(IDX))) {
				p2.wonCards.add(p1.cards.get(IDX));
				p2.wonCards.add(p2.cards.get(IDX));
				p1.cards.remove(IDX);
				p2.cards.remove(IDX);
				p2.won+=2;
			}
			else if(p1.cards.get(IDX).isEqual(p2.cards.get(IDX))) {
				if(p1.cards.size()<3 || p1.cards.size()<3) {
					continue;
				}
				else {
					war();
				}
				
			}
		}
	}
	
	static void war() {
		if(p1.cards.size()>2){
		p1.drawCard();
		p1.drawCard();
		p2.drawCard();
		p2.drawCard();
		}
		
		if(p1.cards.get(IDX).isGreater(p2.cards.get(IDX))) {
			p1.won+=2+Player.warWon.size();
			p1.wonCards.add(p1.cards.get(IDX));
			p1.wonCards.add(p2.cards.get(IDX));
			if(Player.warWon.size()>0) {
			for(int i=Player.warWon.size();i>0;i--) {
				p1.wonCards.add(Player.warWon.get(IDX));
				Player.warWon.remove(IDX);
				}
			}
			p1.cards.remove(IDX);
			p2.cards.remove(IDX);
			p1.won+=6;
		}
		 else if(p2.cards.get(IDX).isGreater(p1.cards.get(IDX))) {
			 p2.won+=2+Player.warWon.size();
			p2.wonCards.add(p1.cards.get(IDX));
			p2.wonCards.add(p2.cards.get(IDX));
			if(Player.warWon.size()>0) {
			for(int i=Player.warWon.size();i>0;i--) {
				p2.wonCards.add(Player.warWon.get(IDX));
				Player.warWon.remove(IDX);
				}
			}
			p1.cards.remove(IDX);
			p2.cards.remove(IDX);
			
		}
		 else if (p1.cards.get(IDX).isEqual(p2.cards.get(IDX))) {
			if (p1.cards.size() == 3) {
				Player.warWon.add(p1.cards.get(IDX));
				Player.warWon.add(p2.cards.get(IDX));
				p2.cards.remove(IDX);
				p2.cards.remove(IDX);
				war();
			}
			if (p1.cards.size() == 2) {
				Player.warWon.add(p1.cards.get(IDX));
				Player.warWon.add(p2.cards.get(IDX));
				p1.cards.remove(IDX);
				p2.cards.remove(IDX);
				war();
			}
			if (p1.cards.size() == 1 ) {
				return;
			}
			
			else {
				war();
			}
			

		}
	}
	
}
