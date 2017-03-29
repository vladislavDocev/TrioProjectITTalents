package traders;

public abstract class Provider {
	
	private String name;
	private String address;
	private String workHours;
	private int discount;
	
	public Provider(String name, String address, String workHours) {
		this.name = name;
		this.address = address;
		this.workHours = workHours;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
