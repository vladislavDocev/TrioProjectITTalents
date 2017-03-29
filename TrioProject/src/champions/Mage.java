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

	@Override
	void castMagic(IMagic magic, Champion target) {
		if (!this.isCrowControlled) {
			if (this.magics.contains(magic)) {
				if (target != null) {
					if (target.equals(this.enemy)) {
						if (magic instanceof IEnemySpells) {
							magic.affect(target);
						} else {
							System.out.println("Invalid target");
						}
					} else {
						if (target.equals(this)) {
							if (magic instanceof ISelfCastSpells) {
								magic.affect(target);
							} else {
								System.out.println("Invalid target");
							}
						} else {
							if (target.equals(this.ally)) {
								if (magic instanceof IAllySpells) {
									magic.affect(target);
								} else {
									System.out.println("Invalid target");
								}
							}
						}
					}
				}
			}
		}else{
			System.out.println("Cannot cast while crowd controlled.");
		}
	}

}
