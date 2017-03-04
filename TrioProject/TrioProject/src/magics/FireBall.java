package magics;

import champions.Champion;

public class FireBall extends Magic implements IMageMagic, IEnemySpells {

	public static final int FIREBALL_BASE_DAMAGE = 50;
	
	public FireBall() {
		super(MagicTypes.FIREBALL);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.reduceHP(FIREBALL_BASE_DAMAGE);
		}
	}
}
