package magics;

import champions.Champion;

public class Polymorph extends Magic implements IMageMagic, IEnemySpells{

	public Polymorph() {
		super(MagicTypes.POLYMORPH);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.crowdControlled();
		}
	}

}
