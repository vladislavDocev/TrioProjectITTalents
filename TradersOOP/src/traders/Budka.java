package traders;

import java.util.ArrayList;
import java.util.Random;

public class Budka extends TradePlace implements ETTradePlaces {
	
	public Budka(String address) {
		super(address,new Random().nextInt(91)+10,150);
	}

}
