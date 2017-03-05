package magics;

import champions.Champion;

public class Poison extends Magic implements IRogueMagic, IEnemySpells{

	private static final int POISON_BASE_DURATION = 3;
	private static final int POISON_BASE_AMOUNT = 15;

	public Poison() {
		super(MagicTypes.POISON);
	}

	@Override
	public void affect(Champion target) {
		if (target != null) {
			for (int i = 0; i < POISON_BASE_DURATION; i++) {
				target.reduceHP(POISON_BASE_AMOUNT);
			}
		}
	}

}
