package traders;

import java.util.Random;

public class MallShop extends TradePlace {

	public MallShop(String address) {
		super(address,new Random().nextInt(3)+4,50);
	}
	
}
