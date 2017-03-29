package traders;

import java.util.ArrayList;
import java.util.Random;

public class Sergiq extends TradePlace implements ETTradePlaces {

	public Sergiq(String address) {
		super(address, new Random().nextInt(9)+2, 50);
	}
	
}
