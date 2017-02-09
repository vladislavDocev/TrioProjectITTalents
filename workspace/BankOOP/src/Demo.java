import java.util.ArrayList;
import java.util.Random;


public class Demo {

	public static void main(String[] args) {

		Bank bank = new Bank("My Bank", "V nas", 118900);
		System.out.println("*****Starting bank balance*****");
		System.out.println(bank.getBankReserve());
		System.out.println(bank.getBankCash());
		
		ArrayList<Client> clients = new ArrayList<Client>();
		
		while(clients.size()<=10) {
			double randomCash = new Random().nextDouble()*1000;
			double randomSalary = new Random().nextDouble()*1000;
			Client cl = new Client("Name" + clients.size(), "Address" + clients.size(), randomCash, randomSalary, bank);
			clients.add(cl);
			double randomDeposit = new Random().nextDouble()*20 +80;
			cl.openDeposit((randomDeposit/100)*cl.getCash(), 12);
			cl.openCredit((randomDeposit/100)*cl.getCash(), 12);
		}
		
		System.out.println(clients);
		System.out.println("*****Bank reserve now is : " + bank.getBankReserve());
		System.out.println("*****Total bank in cash now is : " + bank.getBankCash());

	}

}
