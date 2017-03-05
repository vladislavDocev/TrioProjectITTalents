package magics;

import champions.Champion;

public class FrostBolt extends Magic implements IMageMagic, IEnemySpells {

	public static final int FROSTBOLT_BASE_DAMAGE = 35;
	
	public FrostBolt() {
		super(MagicTypes.FROSTBOLT);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.reduceHP(FROSTBOLT_BASE_DAMAGE);
		}
	}
	
	
}
