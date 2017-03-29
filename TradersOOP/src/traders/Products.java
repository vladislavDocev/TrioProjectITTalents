package traders;

public class Products {
	
	enum productsName { FOOD,CLOTHES,MISCELLANOUS,JEWELS,GOLD }
	
	private productsName name;
	private double price;
	
	public Products(productsName name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}

	

}
