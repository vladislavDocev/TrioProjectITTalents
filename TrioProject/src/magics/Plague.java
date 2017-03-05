package magics;

import champions.Champion;

public class Plague extends Magic implements IPriestMagic, IEnemySpells {

	public static final int PLAGUE_BASE_AMOUNT = 20;
	public static final int PLAGUE_BASE_DURATION = 2;

	public Plague() {
		super(MagicTypes.RENEW);

	}

	@Override
	public void affect(Champion target) {
		if (target != null) {
			for (int i = 0; i < PLAGUE_BASE_DURATION; i++) {
				target.reduceHP(PLAGUE_BASE_AMOUNT);
			}
		}
	}
}
