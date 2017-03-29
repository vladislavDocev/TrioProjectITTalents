package traders;

import java.util.ArrayList;
import java.util.Random;

public class TradeChain extends Trader {
	
	ArrayList<Provider> providers;
	ArrayList<TradePlace> tradePlaces;

	public TradeChain(String name, String address, double capital, ArrayList<Provider> providers,ArrayList<TradePlace> tradePlaces) {
		super(name, address, capital);
		this.providers=providers;
		this.tradePlaces=tradePlaces;
	}
	
	@Override
	public void makeOrder(TradePlace tp, Provider pr, double amount) {
		if(this.getCapital()*0.5>amount) {
			this.setCapital(this.getCapital()+amount*(pr.getDiscount()/100));
			if(this.tradePlaces.contains(tp)) {
			tp.getProducts().addAll(this.generateRandomProducts(amount));
			}
			else {
				this.tradePlaces.add(tp);
				tp.getProducts().addAll(this.generateRandomProducts(amount));
			}
		}
		else {
			System.out.println("Trader " + this.getName() + " does not have enough capital to make order.");
		}
		
	}

	
	public void getMoney(TradePlace tp) {
		double amount = 0;
		for (int i = 0; i < tp.getProducts().size(); i++) {
			amount+=tp.getProducts().get(i).getPrice();
		}
		this.setCapital(this.getCapital()+((130.0/100.0)*amount));
	}

	@Override
	public void payTax() {
		double amount = 0;
		for (int i = 0; i < this.tradePlaces.size(); i++) {
			amount+=this.tradePlaces.get(i).getTax();
		}
		this.setCapital(this.getCapital()-amount);
		System.out.println("Tax for all trade places paid successfully");
	}

	@Override
	public void getMoney() {
		double amount = 0;
		for (int i = 0; i < this.tradePlaces.size(); i++) {
			for (int j = 0; j < this.tradePlaces.get(i).getProducts().size(); j++) {
				amount+=this.tradePlaces.get(i).getProducts().get(j).getPrice();
			}
		}
		this.tradePlaces=new ArrayList<TradePlace>();
		this.setCapital(this.getCapital()+((130.0/100.0)*amount));
		System.out.println("Collected money from all Trade Places of TradeChain");
		
	}

	@Override
	public Provider getProvider() {
		return this.providers.get(new Random().nextInt(this.providers.size()));
	}

	@Override
	public TradePlace getTradePlace() {
		return this.tradePlaces.get(new Random().nextInt(this.tradePlaces.size()));
	}

}
