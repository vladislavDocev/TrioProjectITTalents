package immigrants;

import java.util.ArrayList;

public class Extremist extends Immigrant implements SpecImmigrant{
	
	private ArrayList<Weapon> weapons;
	
	public Extremist(String string, int nextInt) {
		super(string,nextInt);
		this.weapons = new ArrayList<Weapon>();
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
		return false;
	}

	@Override
	public int fire() throws Exception  {
		for (int i = 0; i < this.weapons.size(); i++) {
			if(this.weapons.get(i) instanceof Bomb) {
				((Bomb)this.weapons.get(i)).blowUp();
				throw new Exception("BOMB EXPLOSION");
			}
		}
		return 0;
	}
	
	@Override
	public int compareTo(Object obj) {
		return this.getMoney()-((Immigrant)obj).getMoney();
	}

}
