package champions;

import magics.Heal;
import magics.IMagic;
import magics.Plague;
import magics.PowerShield;
import magics.Renew;

public class Priest extends Champion{

	public Priest(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.PRIEST, health, energy, dmg, armor);
		
		PowerShield ps = new PowerShield();
		Heal h = new Heal();
		Renew r = new Renew();
		Plague pl = new Plague();
		
		magics.put(ps.getType(), ps);
		magics.put(h.getType(), h);
		magics.put(r.getType(),r);
		magics.put(pl.getType(), pl);
	}

}
