package magics;

import champions.Champion;

public class Renew extends Magic implements IPriestMagic, IAllySpells, ISelfCastSpells {

	public static final int RENEW_BASE_AMAOUNT = 25;

	public Renew() {
		super(MagicTypes.RENEW);

	}

	@Override
	public void affect(Champion target) {
		if (target != null) {
			target.increaseHP(RENEW_BASE_AMAOUNT);
		}
	}
}
