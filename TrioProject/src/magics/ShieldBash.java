package magics;

import champions.Champion;

public class ShieldBash extends Magic implements IWarriorMagic, IEnemySpells{
	
	public ShieldBash() {
		super(MagicTypes.SHIELDBASH);
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.crowdControlled();
		}
	}


}
