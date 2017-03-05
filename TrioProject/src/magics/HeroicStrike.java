package magics;

import champions.Champion;

public class HeroicStrike extends Magic implements IWarriorMagic, IEnemySpells{

	public static final int HEROICSTRIKE_BASE_AMAOUNT = 30;
	
	public HeroicStrike() {
		super(MagicTypes.HEROICSTRIKE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.reduceHP(HEROICSTRIKE_BASE_AMAOUNT);
		}
	}


}
