package traders;

import java.util.ArrayList;

public abstract class TradePlace {
	
	private String address;
	private String workHours;
	private int size;
	private double tax;
	private ArrayList<Products> products;
	
	public TradePlace(String address, int size, double tax) {
		this.address = address;
		this.workHours = "8:30-20:00";
		this.size = size;
		this.tax = tax;
		this.products=new ArrayList<Products>();
	}
	public void addProducts(ArrayList<Products> products) {
		this.products.addAll(products);
	}
	public ArrayList<Products> getProducts() {
		return products;
	}
	public double getTax() {
		return tax;
	}
	
}
