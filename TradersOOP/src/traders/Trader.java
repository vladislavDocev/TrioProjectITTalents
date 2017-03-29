package traders;

import java.util.ArrayList;
import java.util.Random;

import traders.Products.productsName;

public abstract class Trader {
	
	private String name;
	private String address;
	private double capital;
	
	public Trader(String name, String address, double capital) {
		this.name = name;
		this.address = address;
		this.capital = capital;
	}

	public abstract void makeOrder(TradePlace tp,Provider pr,double amount); 
	
	public abstract void getMoney();
	
	public abstract void payTax();

	public ArrayList<Products> generateRandomProducts(double amount) {
		ArrayList<Products> products = new ArrayList<Products>();
		while(amount>=0) {
			productsName pn = productsName.values()[new Random().nextInt(productsName.values().length)];
			if(amount < 15) {
				products.add(new Products(pn,amount));
				amount-=amount;
				break;
			}
			else {
			int newAmount = new Random().nextInt(11)+5;
			products.add(new Products(pn,newAmount));
			amount-=newAmount;
			}
		}
		return products;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getCapital() {
		return capital;
	}
	public abstract Provider getProvider();

	public String getName() {
		return name;
	}
	public abstract TradePlace getTradePlace();
	

}
