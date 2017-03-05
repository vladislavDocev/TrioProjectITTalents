package champions;

import magics.FireBall;
import magics.FrostBolt;
import magics.IAllySpells;
import magics.IEnemySpells;
import magics.IMageMagic;
import magics.IMagic;
import magics.ISelfCastSpells;
import magics.IceBlock;
import magics.Polymorph;

public class Mage extends Champion {

	public Mage(int health, int energy, int dmg, int armor) {
		super(ChampionTypes.MAGE, health, energy, dmg, armor);

		magics.add(new FireBall());
		magics.add(new FrostBolt());
		magics.add(new IceBlock());
		magics.add(new Polymorph());
	}

}
