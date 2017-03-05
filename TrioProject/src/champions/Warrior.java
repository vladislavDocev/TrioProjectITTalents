package champions;

import magics.HeroicStrike;
import magics.IMagic;
import magics.Intervene;
import magics.ShieldBash;
import magics.ShieldBlock;

public class Warrior extends Champion{

	public Warrior(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.WARRIOR, health, energy, dmg, armor);
		
		ShieldBash sb = new ShieldBash();
		HeroicStrike hs = new HeroicStrike();
		Intervene i = new Intervene();
		ShieldBlock sbl = new ShieldBlock();
		
		magics.put(sb.getType(), sb);
		magics.put(hs.getType(), hs);
		magics.put(i.getType(), i);
		magics.put(sbl.getType(), sbl);
	}
}
