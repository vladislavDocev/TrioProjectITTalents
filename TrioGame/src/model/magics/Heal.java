package model.magics;

import model.champions.Champion;

public class Heal extends Buffs {

	public static final int HEAL_BASE_AMAOUNT = 28;
	
	public Heal() {
		super(MagicTypes.HEAL,HEAL_BASE_AMAOUNT,25000,5000);
	}

}
