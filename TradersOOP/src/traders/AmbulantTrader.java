package traders;

import java.util.ArrayList;

public class AmbulantTrader extends Trader {

	SmallProvider sp;
	ArrayList<Products> products = new ArrayList<Products>();
	
	public AmbulantTrader(String name, String address, double capital , SmallProvider sp) {
		super(name, address, capital);
		this.sp=sp;
		this.products = new ArrayList<Products>();
	}
	
	@Override
	public void makeOrder(TradePlace tp, Provider pr, double amount) {
		if(this.getCapital()*0.5>amount) {
			this.setCapital(this.getCapital()+amount*(pr.getDiscount()/100));
			this.products.addAll(this.generateRandomProducts(amount));
		}
		else {
			System.out.println("Trader " + this.getName() + " does not have enough capital to make order.");
		}
		
	}

	@Override
	public void getMoney() {
		int amount=0;
		for (int i = 0; i < products.size();) {
			amount+=products.get(i).getPrice();
			products.remove(i);
			}
		this.setCapital(this.getCapital()+((130.0/100.0)*amount));
	}

	@Override
	public void payTax() {
		System.out.println("No taxes for this trader");
	}

	@Override
	public Provider getProvider() {
		return this.sp;
	}

	@Override
	public TradePlace getTradePlace() {
		return null;
	}

}
