package magics;

import champions.Champion;

public class Intervene extends CCSpells{

	public Intervene() {
		super(MagicTypes.INTERVENE,12,4000,12000);
	}

	@Override
	public void affect(Champion target) {
		super.affect(target);
		target.silence(this.getDuration());
		target.reduceHP(this.getDamage());
	}


}
