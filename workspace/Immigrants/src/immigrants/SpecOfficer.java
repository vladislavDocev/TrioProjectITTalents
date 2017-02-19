package immigrants;

import java.util.Random;

public class SpecOfficer extends Police {

	public SpecOfficer(String name, City city, Country country) {
		super(name, city, country);
	}
	
	public boolean checkImmigrant(SpecImmigrant si) {
		if(((Immigrant)si).getPassport()) {
			return true;
		}
			return false;
	}
	
	public boolean catchImmigrant(SpecImmigrant i){
		int chanceToCatch = new Random().nextInt(100);
		if(chanceToCatch<90) {
			return true;
		}
		return false;
	}

}
