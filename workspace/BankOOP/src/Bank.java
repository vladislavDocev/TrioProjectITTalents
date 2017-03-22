import java.util.ArrayList;


public class Bank {
	
	public static final int BANK_INTEREST = 10;
	private String name;
	private String address;
	private ArrayList<BankProduct> products;
	private double bankCash; // this is all the cash in the bank (+bankReserve)
	private double bankReserve; // I set this to 10% of all deposits in the bank ( only in case of deposits scenario i will need this)
	
	public Bank(String name, String address, double bankCash) {
		this.name = name;
		this.address = address;
		this.products = new ArrayList<BankProduct>();
		this.bankCash = bankCash ;
		this.bankReserve = this.calculateBankReserve();
	}
	
	public double calculateBankReserve() {
		this.bankReserve=0;
		for(BankProduct d : this.products) {
			if(d instanceof Deposit) {
				this.bankReserve+= ((Deposit)d).getSum();
			}
		}
		this.bankReserve=(10.0/100.0)*this.bankReserve;
		return this.bankReserve;
	}

	public void acceptDeposit(double sum) {
		this.products.add(new Deposit("Deposit",BANK_INTEREST,sum));
		this.bankReserve=this.calculateBankReserve();
		this.bankCash+=sum;
	}
	
	public void payInterestAll() {
		for(BankProduct d : this.products) {
		
			if(d instanceof Deposit) {
				double sumToPay = d.getSum()+this.getInterestDeposit((Deposit)d);
				if(this.bankCash-sumToPay>this.bankReserve) {
				d.setSum(sumToPay);
				this.bankCash-=sumToPay;
				}
				else {
					System.out.println("Bank goes broke!");
				}
			}
		}
	}
	
	public double getInterestDeposit(Deposit d) {
		return d.getSum()*BANK_INTEREST;
	}
	
	public void getMonthlyCreditPayment(double sum) {
		this.bankCash+=sum;
	}
	
	public boolean giveCredit(Client c,double sum,int duration) {
		double clientSum=0;
		if(this.bankCash-sum<this.bankReserve){  // моя реализация на "Ако исканата сума за кредит надхвърля банковия резерв, банката не може да отпусне кредита"
			return false;
		}
		for(Credit cr : c.getCredits()) {
			clientSum+=cr.getMonthPayment();
		}
		if(clientSum>(1/2)*(c.getSalary())) {
			return false;
		}
		this.bankCash-=sum;
		this.products.add(new Credit("Credit",BANK_INTEREST,duration,sum));
		return true;
	}

	public double getBankCash() {
		return bankCash;
	}
	public double getBankReserve() {
		return bankReserve;
	}

}
