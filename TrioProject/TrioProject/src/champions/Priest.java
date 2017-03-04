package champions;

import magics.Heal;
import magics.Plague;
import magics.PowerShield;
import magics.Renew;

public class Priest extends Champion{

	public Priest(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.PRIEST, health, energy, dmg, armor);
		
		magics.add(new PowerShield());
		magics.add(new Heal());
		magics.add(new Renew());
		magics.add(new Plague());
	}

}
