package traders;

public class BigProvider extends Provider {
	
	public BigProvider(String name, String address, String workHours) {
		super(name, address, workHours);
		this.setDiscount(0);
	}

}
