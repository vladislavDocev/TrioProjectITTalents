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

		FireBall f = new FireBall();
		FrostBolt fb = new FrostBolt();
		IceBlock ib = new IceBlock();
		Polymorph poly = new Polymorph();
		
		magics.put(f.getType(), f);
		magics.put(fb.getType(), fb);
		magics.put(ib.getType(), ib);
		magics.put(poly.getType(), poly);
	}

}
