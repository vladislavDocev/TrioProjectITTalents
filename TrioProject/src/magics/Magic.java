package magics;

import champions.Champion;

public abstract class Magic implements IMagic {
	
	public enum MagicTypes{
					POWERSHIELD, HEAL, RENEW, PLAGUE, 
					FIREBALL, FROSTBOLT, ICEBLOCK, POLYMORPH, 
					SHIELDBLOCK, HEROICSTRIKE, INTERVENE, SHIELDBASH, 
					BACKSTAB, VANISH, KILLINGSPREE, POISON
					}
	
	private final MagicTypes type;
	private Champion target;
	private final int costEnergy;
	
	public Magic(MagicTypes type) {
		this.type = type;
		this.costEnergy = 10;
	}
	
	@Override
	public MagicTypes getType() {
		return this.type;
	}
}
