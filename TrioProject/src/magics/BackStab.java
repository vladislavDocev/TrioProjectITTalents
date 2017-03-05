package magics;

import champions.Champion;

public class BackStab extends Magic implements IRogueMagic, IEnemySpells {

	public static final int CRIT_MOD = 2;
	public static final int BACKSTAB_DEFAULT_DMG = 60;
	
	public BackStab() {
		super(MagicTypes.BACKSTAB);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.reduceHP(BACKSTAB_DEFAULT_DMG * CRIT_MOD);
		}
	}

}
