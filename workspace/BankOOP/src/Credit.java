
public class Credit extends BankProduct {
	
	private double monthPayment;
	
	public Credit(String name, int interest, int duration, double sum) {
		super(name, interest, duration, sum);
		this.monthPayment = (sum/duration) + ((interest/100)*(sum/duration));
	}

	public double getMonthPayment() {
		return monthPayment;
	}

	
	

}
