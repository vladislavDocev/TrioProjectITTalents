package immigrants;

import java.util.Random;

public class PoliceOfficer extends Police {

	public PoliceOfficer(String name, City city, Country country) {
		super(name, city, country);
	}
	
	public boolean checkImmigrant(Immigrant i) {
		if (i instanceof Normal) {
			return true;
		}
		if(i.getPassport()) {
			return true;
		}
			return false;
	}
	
	public boolean catchImmigrant(Immigrant i){
		int chanceToCatch = new Random().nextInt(100);
		if(chanceToCatch<50) {
			return true;
		}
		return false;
	}

	

}
