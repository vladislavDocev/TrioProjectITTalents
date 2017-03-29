package traders;

public class SmallProvider extends Provider {

	public SmallProvider(String name, String address, String workHours) {
		super(name, address, workHours);
		this.setDiscount(15);
	}
	
	

}
