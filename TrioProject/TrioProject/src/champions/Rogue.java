package champions;

import magics.BackStab;
import magics.KillingSpree;
import magics.Poison;
import magics.Vanish;

public class Rogue extends Champion{

	public Rogue(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.ROGUE, health, energy, dmg, armor);
		
		magics.add(new BackStab());
		magics.add(new Vanish());
		magics.add(new KillingSpree());
		magics.add(new Poison());
	}

}
