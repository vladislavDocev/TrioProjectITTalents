package immigrants;

public abstract class Weapon {
	
	private int price;
	private int quantity;
	
	public Weapon(int price,int quantity){
		this.price=price;
		this.quantity=quantity;
	}
	
	public abstract int fireWeapon();
	
	public int getQuantity() {
		return this.quantity;
	}

	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Weapon [price=" + price + ", quantity=" + quantity + "]";
	}
	

}
