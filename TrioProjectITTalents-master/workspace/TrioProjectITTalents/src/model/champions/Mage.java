package model.champions;

import model.magics.FireBall;
import model.magics.FrostBolt;
import model.magics.IAllySpells;
import model.magics.IEnemySpells;
import model.magics.IMageMagic;
import model.magics.IMagic;
import model.magics.ISelfCastSpells;
import model.magics.IceBlock;
import model.magics.Polymorph;

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
