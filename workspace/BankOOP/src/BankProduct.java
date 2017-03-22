
public abstract class BankProduct {
	
	private String name;
	private int interest;
	private int duration;
	private double sum;
	
	public BankProduct(String name, int interest, int duration, double sum) {
		if(name.equals(null) || name.isEmpty()) {
			this.name="Default name"; // in case of idiots
		}
		else {
			this.name = name;
		}
		this.interest = interest;
		if(duration>=1 || duration<=60) {
			this.duration = duration;
		}
		else {
			this.duration=43;
		}
		this.sum = sum;
	}
	
	public BankProduct(String name, int interest,double sum) {
		this.name = name;
		this.interest = interest;
		this.sum = sum;
	}

	public double getSum() {
		return this.sum;
	}
	
	public void setSum(double sum) {
		this.sum=sum;
	}

	@Override
	public String toString() {
		return "BankProduct [interest=" + interest + ", sum=" + sum + "]";
	}
	
	
	
	

}
