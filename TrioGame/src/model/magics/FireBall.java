package model.magics;

import model.champions.Champion;

public class FireBall extends DamageSpells {

	public static final int FIREBALL_BASE_DAMAGE = 50;
	
	public FireBall() {
		super(MagicTypes.FIREBALL,FIREBALL_BASE_DAMAGE,4000);
	}

}
