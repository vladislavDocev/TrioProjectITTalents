package magics;

import champions.Champion;

public class KillingSpree extends Buffs{

	public KillingSpree() {
		super(MagicTypes.KILLINGSPREE,17,20000,30000);
	}

	@Override
	public void affect(Champion target) {
		target.increaseDamage(this.getDamage(),this.getDuration());
	}

}
