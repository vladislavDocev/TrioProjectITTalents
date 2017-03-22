package magics;

import champions.Champion;

public class Vanish extends Buffs{

	public Vanish() {
		super(MagicTypes.VANISH,0,20000,50000);
	}
	
	@Override
	public void affect(Champion target) {
		super.affect(target);
		target.setIsInvulnurable(this.getDuration());

	}

}
