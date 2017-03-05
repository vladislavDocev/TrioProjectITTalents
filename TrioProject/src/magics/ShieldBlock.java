package magics;

import champions.Champion;

public class ShieldBlock extends Magic implements IWarriorMagic, ISelfCastSpells{

	private static final int SHIELDBLOCK_BASE_AMOUNT = 35;

	public ShieldBlock() {
		super(MagicTypes.SHIELDBLOCK);
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.getShielded(SHIELDBLOCK_BASE_AMOUNT);
		}
	}

}
