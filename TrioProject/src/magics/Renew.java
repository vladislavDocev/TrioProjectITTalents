package magics;

import champions.Champion;

public class Renew extends Magic implements IPriestMagic, IAllySpells, ISelfCastSpells {

	public static final int RENEW_BASE_AMAOUNT = 25;
	private static final int RENEW_BASE_DURATION = 2;

	public Renew() {
		super(MagicTypes.RENEW);

	}

	@Override
	public void affect(Champion target) {
		if (target != null) {
			for (int i = 0; i < RENEW_BASE_DURATION; i++) {
				target.increaseHP(RENEW_BASE_AMAOUNT);
			}
		}
	}
}
