package warGame;

import java.util.ArrayList;
import java.util.Random;


public class Cards {
	String suites[] = { "clubs","diamonds","hearts","spades" };
	String cards[] = { "2","3","4","5","6","7","8","9","10","J","Q","K","A" };
	public String card;
	public String suite;
	static final ArrayList<Cards> deck = new ArrayList<Cards>(); 
	private int newCardIdx=0;
	
	public Cards(int card,int suite) {
		this.card=cards[card];
		this.suite=suites[suite];
	}
	public Cards(){
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < suites.length; j++) {
				Cards newCard = new Cards(i,j);
				deck.add(newCard);
			}
		}
	}
	public Cards (String card,String suite)
	    {
	        this.card = card;
	        this.suite=suite;
	    }
	Cards dealCard() {
		return deck.get(newCardIdx++);
	}
	public void dealCards(Player p1,Player p2) {
		int newIdx=0;
		while(p2.cards.size()<Cards.deck.size()/2) {
			Cards card = deck.get(newIdx);
			p1.getCard(card);
			deck.get(newIdx).card=null;
			deck.get(newIdx).suite=null;
			newIdx++;
			card = deck.get(newIdx);
			p2.getCard(card);
			deck.get(newIdx).card=null;
			deck.get(newIdx).suite=null;
			newIdx++;
		}
		}
			
		
	
	public void shuffle() {
		for (int i = newCardIdx; i < deck.size(); i++) {
			Random r = new Random();
			int random = r.nextInt(deck.size());
			Cards temp = new Cards(deck.get(i).card,deck.get(i).suite);
			deck.get(i).card=deck.get(random).card;
			deck.get(i).suite=deck.get(random).suite;
			deck.get(random).card=temp.card;
			deck.get(random).suite=temp.suite;
		}
	}
	public boolean isGreater(Cards card) {
		int tempIdx1 = 0;
		int tempIdx2 = 0;
		for (int i = 0; i < cards.length; i++) {
			if(this.card.equalsIgnoreCase(cards[i])) {
				tempIdx1=i;
			}
			if(card.card.equalsIgnoreCase(cards[i])) {
				tempIdx2=i;
			}
		}
		return tempIdx1 > tempIdx2;
	}

	    public boolean isEqual(Cards card) {
	    	int tempIdx1 = 0;
			int tempIdx2 = 0;
			for (int i = 0; i < cards.length; i++) {
				if(this.card.equalsIgnoreCase(cards[i])) {
					tempIdx1=i;
				}
				if(card.card.equalsIgnoreCase(cards[i])) {
					tempIdx2=i;
				}
			}
			return tempIdx1 == tempIdx2;
	    }
	    

	    @Override
	    public boolean equals(Object object)
	    {
	        boolean sameSame = false;

	        if (object != null && object instanceof Cards)
	        {
	            sameSame = this.card == ((Cards) object).card && this.suite == ((Cards) object).suite;
	          
	        }

	        return sameSame;
	    }
	

	
	@Override
	public String toString() { 
	    return "Card: '" + this.card + "', Suite: '" + this.suite;
	}
}
