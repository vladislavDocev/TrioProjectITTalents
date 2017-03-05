package magics;

import champions.Champion;

public class KillingSpree extends Magic implements IRogueMagic, IEnemySpells {

	public static final int KILLINGSPREE_ATTACKS = 2;
	public static final int KILLINGSPREE_ATTACK_DMG = 30;

	public KillingSpree() {
		super(MagicTypes.KILLINGSPREE);
	}

	@Override
	public void affect(Champion target) {
		if (target != null) {
			for (int i = 0; i < KILLINGSPREE_ATTACKS; i++) {
				target.reduceHP(KILLINGSPREE_ATTACK_DMG);
			}
		}
	}

}
