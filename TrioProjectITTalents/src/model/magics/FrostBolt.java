package model.magics;

import model.champions.Champion;

public class FrostBolt extends DamageSpells {

	public static final int FROSTBOLT_BASE_DAMAGE = 33;
	
	public FrostBolt() {
		super(MagicTypes.FROSTBOLT,FROSTBOLT_BASE_DAMAGE,0);
	}
	
	
}
