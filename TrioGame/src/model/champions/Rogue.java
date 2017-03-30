package model.champions;

import model.magics.BackStab;
import model.magics.IMagic;
import model.magics.KillingSpree;
import model.magics.Poison;
import model.magics.Vanish;

public class Rogue extends Champion{

	public Rogue(int health, int energy, int dmg) {
		super(ChampionTypes.ROGUE, health, energy, dmg);
		
		BackStab bs = new BackStab(); 
		Vanish v = new Vanish();
		KillingSpree ks = new KillingSpree();
		Poison p = new Poison();
		
		magics.put(bs.getType(), bs);
		magics.put(v.getType(), v);
		magics.put(ks.getType(), ks);
		magics.put(p.getType(), p);
	}
}
