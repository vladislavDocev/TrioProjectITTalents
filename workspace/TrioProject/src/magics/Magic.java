package magics;

import champions.Champion;

public abstract class Magic {
	
	public enum MagicTypes{
					POWERSHIELD, HEAL, RENEW, PLAGUE, 
					FIREBALL, FROSTBOLT, ICEBLOCK, POLYMORPH, 
					SHIELDBLOCK, HEROICSTRIKE, INTERVENE, SHIELDBASH, 
					BACKSTAB, VANISH, KILLINGSPREE, POISON
					}
	
	private final MagicTypes type;
	private Champion target;
	private final int costEnergy;
	private int damage;
	private long timeCast;
	private long cooldown;
	
	public long getCooldown() {
		return cooldown;
	}

	public long getTimeCast() {
		return timeCast;
	}

	public void setTimeCast(long timeCast) {
		this.timeCast = timeCast;
	}
	
	
	public Magic(MagicTypes type,int damage,long cooldown) {
		this.damage=damage;
		this.type = type;
		this.costEnergy = 10;
		this.cooldown=cooldown;
	}
	
	
	public abstract void affect(Champion target);
	
	public int getDamage() {
		return this.damage;
	}
}
