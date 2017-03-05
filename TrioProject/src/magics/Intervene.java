package magics;

import champions.Champion;

public class Intervene extends Magic implements IWarriorMagic, IAllySpells{

	public static final int INTERVENE_BASE_AMAOUNT = 40;
	
	public Intervene() {
		super(MagicTypes.INTERVENE);
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.getShielded(INTERVENE_BASE_AMAOUNT);
		}
	}


}
