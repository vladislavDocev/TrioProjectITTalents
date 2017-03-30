package model.champions;

import model.magics.HeroicStrike;
import model.magics.IMagic;
import model.magics.Intervene;
import model.magics.ShieldBash;
import model.magics.ShieldBlock;

public class Warrior extends Champion{

	public Warrior(int health, int energy, int dmg) {
		super(ChampionTypes.WARRIOR, health, energy, dmg);
		
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
