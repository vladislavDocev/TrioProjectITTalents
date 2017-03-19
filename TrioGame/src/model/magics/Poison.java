package model.magics;

import model.champions.Champion;

public class Poison extends DamageSpells{
	private static final int POISON_DMG=22;

	public Poison() {
		super(MagicTypes.POISON,POISON_DMG,22000);
	}


}
