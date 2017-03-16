package magics;

import champions.Champion;
import magics.Magic.MagicTypes;

public class Vanish extends Buffs{

	public Vanish() {
		super(MagicTypes.VANISH,0,20000,50000);
	}
	
	public void affect(Champion target) {
		super.affect(target);
		target.setIsInvulnurable(this.getDuration());

	}

}
