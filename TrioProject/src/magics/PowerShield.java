package magics;

import champions.Champion;

public class PowerShield extends Magic implements IPriestMagic, IAllySpells, ISelfCastSpells {

	public static final int POWERSHIELD_BASE_AMAOUNT = 40;
	
	public PowerShield() {
		super(MagicTypes.POWERSHIELD );
		
	}

	@Override
	public void affect(Champion target) {
		if(target != null) {
			target.getShielded(POWERSHIELD_BASE_AMAOUNT);
		}
	}
	
}
