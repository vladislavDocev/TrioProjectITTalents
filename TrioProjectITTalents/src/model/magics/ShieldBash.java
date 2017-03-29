package model.magics;

import model.champions.Champion;

public class ShieldBash extends CCSpells{

	public ShieldBash() {
		super(MagicTypes.SHIELDBASH,8,5000,20000);
	}

	@Override
	public void affect(Champion target) {
		super.affect(target);
		target.silence(this.getDuration());
		target.reduceHP(this.getDamage());
	}


}
