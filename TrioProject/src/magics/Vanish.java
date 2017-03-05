package magics;

import champions.Champion;

public class Vanish extends Magic implements IRogueMagic, ISelfCastSpells{

	public Vanish() {
		super(MagicTypes.VANISH);
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.becomeUntargettable();
		}
	}

}
