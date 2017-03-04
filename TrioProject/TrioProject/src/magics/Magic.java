package magics;

public abstract class Magic {
	
	public enum MagicTypes{
					POWERSHIELD, HEAL, RENEW, PLAGUE, 
					FIREBALL, FROSTBOLT, ICEBLOCK, POLYMORPH, 
					SHIELDBLOCK, HEROICSTRIKE, INTERVENE, SHIELDBASH, 
					BACKSTAB, VANISH, KILLINGSPREE, POISON
					}
	
	private final MagicTypes type;
	private final int costEnergy;
	
	public Magic(MagicTypes type) {
		this.type = type;
		this.costEnergy = 10;
	}
	
	
}
