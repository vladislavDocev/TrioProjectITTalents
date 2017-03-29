package magics;

import champions.Champion;

public class Poison extends Magic implements IRogueMagic, IEnemySpells{
	private static final int POISON_DMG=22;

	public Poison() {
		super(MagicTypes.POISON,POISON_DMG,22000);
	}


}
