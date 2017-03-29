package traders;

import java.util.ArrayList;
import java.util.Random;

public class ETrader extends Trader {
	
	private ArrayList<SmallProvider> smallProvider;
	private ETTradePlaces tradePlace;

	public ETrader(String name, String address, double capital,ETTradePlaces tradePlace,ArrayList<SmallProvider> sp) {
		super(name, address, capital);
		this.smallProvider=sp;
		this.tradePlace=tradePlace;
	}
	
	@Override
	public void makeOrder(TradePlace tp, Provider pr, double amount) {
		if(this.getCapital()*0.5>amount) {
			this.setCapital(this.getCapital()+amount*(pr.getDiscount()/100));
			tp=((TradePlace)this.tradePlace);
			tp.getProducts().addAll(this.generateRandomProducts(amount));
		}
		else {
			System.out.println("Trader " + this.getName() + " does not have enough capital to make order.");
		}
		
	}
	
	@Override
	public void getMoney() {
		double amount = 0;
		for (int i = 0;  i < ((TradePlace)this.tradePlace).getProducts().size();) {
			amount += ((TradePlace)this.tradePlace).getProducts().get(i).getPrice();
			((TradePlace)this.tradePlace).getProducts().remove(i);
		}
		this.setCapital(this.getCapital()+((130.0/100.0)*amount));
		
	}

	@Override
	public void payTax() {
		this.setCapital(this.getCapital()-(((TradePlace)this.tradePlace).getTax()));
		System.out.println("Tax for trade place paid successfully");
	}
	@Override
	public Provider getProvider() {
		return this.smallProvider.get(new Random().nextInt(this.smallProvider.size()));
	}

	@Override
	public TradePlace getTradePlace() {
		return (TradePlace)this.tradePlace;
	}

}
