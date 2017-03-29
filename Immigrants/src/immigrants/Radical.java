package immigrants;

import java.util.ArrayList;

public class Radical extends Immigrant implements SpecImmigrant {
	
	private Passport p;
	private ArrayList<Weapon> weapons;

	public Radical(String string, int nextInt) {
		super(string,nextInt);
		this.weapons = new ArrayList<Weapon>();
	}
	
	public void setPassport(Passport p) {
		this.p=p;
	}

	@Override
	public void buyWeapon(Weapon weapon) throws Exception {
		if(this.getMoney()>=weapon.getPrice()) {
			this.weapons.add(weapon);
			System.out.println(this.getName() + " successfully buys weapon " + weapon);
		}
		else {
			this.getCity().remove(this);
			throw new Exception("Immigrant dies from anger and leaves newWave of Immigrants");
		}
		
	}

	@Override
	public boolean getPassport() {
		return true;
	}

	@Override
	public int fire(){
		int amountFired=0;
		for (int i = 0; i < this.weapons.size(); i++) {
			amountFired+=this.weapons.get(i).fireWeapon();
		}
		return amountFired;
	}

	@Override
	public int compareTo(Object obj) {
		return this.getMoney()-((Immigrant)obj).getMoney();
	}


}
