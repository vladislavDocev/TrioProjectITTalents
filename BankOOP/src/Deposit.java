
public class Deposit extends BankProduct {
	
	private double monthPaid;
	
	public Deposit(String name, int interest, int duration, double sum) {
		super(name, interest, duration, sum);
		this.monthPaid=(interest/100)*(sum/duration);
	}
	public Deposit(String name,int interest,double sum) {
		super(name,interest,sum);
	}
		

}
