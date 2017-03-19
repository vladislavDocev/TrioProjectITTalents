package model.magics;

import model.champions.Champion;

public class IceBlock extends Buffs {

	public IceBlock() {
		super(MagicTypes.ICEBLOCK,0,10000,60000);
	}

	@Override
	public void affect(Champion target) {
		super.affect(target);
		target.setIsInvulnurable(this.getDuration());
	}
}
