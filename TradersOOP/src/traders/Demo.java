package traders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<SmallProvider> sp = new ArrayList<SmallProvider>();
		ArrayList<BigProvider> bp = new ArrayList<BigProvider>();
		ArrayList<Provider> pr = new ArrayList<Provider>();

		for (int i = 0; i < 20; i++) {
			int j = new Random().nextInt(2);
			switch(j) {
			case 0: SmallProvider sp1 = new SmallProvider("SmallProvider", "Address", "8:30-20:00");
			sp.add(sp1);
			break;
			case 1: BigProvider bp1 = new BigProvider("BigProvider", "Address", "8:30-20:00");
			bp.add(bp1);
			break;
			}
		}
		
		pr.addAll(sp);
		pr.addAll(bp);
		
		System.out.println(sp.size() + " " + bp.size());
		
		ArrayList<TradePlace> tp = new ArrayList<TradePlace>();
		for (int i = 0; i < 20; i++) {
			int j = new Random().nextInt(3);
			switch(j) {
			case 0: Sergiq s = new Sergiq("Address");
			tp.add(s);
			break;
			case 1: Budka b = new Budka("Address");
			tp.add(b);
			break;
			case 2: MallShop ms = new MallShop("Address");
			tp.add(ms);
			break;
			}
		}
		AmbulantTrader ambTr = new AmbulantTrader("AmbulantTrader", "address", 100, sp.get(0));
		ETrader eTr = new ETrader("ETrader", "address", 500, new Budka("Address"), sp );
		TradeChain tradeChain = new TradeChain("TradeChain", "address", 3000, pr ,tp );
		
		ArrayList<Trader> traders = new ArrayList<Trader>();
		traders.add(ambTr);
		traders.add(eTr);
		traders.add(tradeChain);
			
		doTrading(traders);
	}
	
	public static void doTrading(ArrayList<Trader> traders) {
		for (int i = 0; i < traders.size(); i++) {
			if (traders.get(i)instanceof AmbulantTrader) {
				((AmbulantTrader) traders.get(i)).makeOrder(null, (SmallProvider) traders.get(i).getProvider() , 49);
				System.out.println("Ambulant trader products:");
				System.out.println(((AmbulantTrader) traders.get(i)).products);
			}
			else if (traders.get(i)instanceof ETrader) {
				((ETrader) traders.get(i)).makeOrder(traders.get(i).getTradePlace(), (SmallProvider) traders.get(i).getProvider(),149);
				System.out.println("ET trader products:");
				System.out.println(((ETrader) traders.get(i)).getTradePlace().getProducts());
			}
			if (traders.get(i)instanceof TradeChain) {
				for (int j = 0; j <((TradeChain) traders.get(i)).tradePlaces.size(); j++) {
					((TradeChain) traders.get(i)).makeOrder(traders.get(i).getTradePlace(), traders.get(i).getProvider(),249);
					System.out.println("Trade Chain trader products:");
					System.out.println(((TradeChain) traders.get(i)).tradePlaces.get(j).getProducts());
				}
				
			}
		}
	}

}
