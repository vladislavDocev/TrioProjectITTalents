package warGame;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	String name;
	ArrayList<Cards> cards = new ArrayList<Cards>(); 
	ArrayList<Cards> wonCards = new ArrayList<Cards>();
	static ArrayList<Cards> warWon=new ArrayList<Cards>();
	int won=0;
	
	public Player(String name) {
		this.name=name;
	}
	
	public void getCard(Cards card) {
		this.cards.add(new Cards(card.card,card.suite));
	}
	public void drawCard() {
		int idx = 0;
		Player.warWon.add(this.cards.get(idx));
		this.cards.remove(idx);
	}
	
	
}
