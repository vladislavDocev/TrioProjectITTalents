package champions;

import magics.BackStab;
import magics.IMagic;
import magics.KillingSpree;
import magics.Poison;
import magics.Vanish;

public class Rogue extends Champion{

	public Rogue(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.ROGUE, health, energy, dmg, armor);
		
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
