package model.champions;

import model.magics.Heal;
import model.magics.IMagic;
import model.magics.Plague;
import model.magics.PowerShield;
import model.magics.Renew;

public class Priest extends Champion{

	public Priest(int health, int energy, int dmg) {
		super(ChampionTypes.PRIEST, health, energy, dmg);
		
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
