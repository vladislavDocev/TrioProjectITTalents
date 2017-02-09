import java.util.ArrayList;


public class Client {

	private String name;
	private String address;
	private double cash;
	private double salary;
	private ArrayList<Deposit> deposits;
	private ArrayList<Credit> credits;
	private Bank bank;
	
	public Client(String name, String address, double cash, double salary, Bank bank) {
		this.name = name;
		this.address = address;
		this.cash = cash;
		this.salary = salary;
		this.bank=bank;
		this.deposits = new ArrayList<Deposit>();
		this.credits = new ArrayList<Credit>();
	}
	
	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public double getSalary() {
		return salary;
	}

	public void openDeposit(double sum,int period) {
		if(this.cash > 0 && this.cash >= sum) {
		this.bank.acceptDeposit(sum);
		this.deposits.add(new Deposit("Deposit",Bank.BANK_INTEREST,period,sum));
		this.cash-=sum;
		System.out.println(this.name + " Deposits " + sum);
		}
		else {
			System.out.println("Client does not have enough cash!");
		}
	}
	
	public void openCredit(double sum,int duration) {
		if(this.bank.giveCredit(this, sum, duration)) {
			this.credits.add(new Credit("Credit",Bank.BANK_INTEREST,duration,sum));
			this.cash+=sum;
			System.out.println(this.name + " Got approved for credit! Total sum of credit is: " + sum);
		}
		else {
			System.out.println("Client does not meet requirements for credit approval");
		}
	}
	
	public void payCreditsForMonth() { // there is a possibility that Client is left with negative amount of money
		for(Credit cr : this.credits) { // i leave it like this, because i think its possible that he ends up owing money, thus negative balance in bank acc
			this.cash-=cr.getMonthPayment();
			this.bank.getMonthlyCreditPayment(cr.getMonthPayment());
		}
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", cash=" + cash + ", salary=" + salary
				+ ", deposits=" + deposits + ", credits=" + credits + ", bank="
				+ bank + "]";
	}

	public double getCash() {
		return cash;
	}
	
	
}
