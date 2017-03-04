package champions;

import magics.HeroicStrike;
import magics.Intervene;
import magics.ShieldBash;
import magics.ShieldBlock;

public class Warrior extends Champion{

	public Warrior(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.WARRIOR, health, energy, dmg, armor);
		
		magics.add(new ShieldBlock());
		magics.add(new HeroicStrike());
		magics.add(new Intervene());
		magics.add(new ShieldBash());
	}

}
