package magics;

import champions.Champion;

public class Heal extends Magic implements IPriestMagic, IAllySpells, ISelfCastSpells {

	public static final int HEAL_BASE_AMAOUNT = 50;
	
	public Heal() {
		super(MagicTypes.HEAL);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.increaseHP(HEAL_BASE_AMAOUNT);
		}
	}	
}
