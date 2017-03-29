package magics;

import champions.Champion;
import magics.Magic.MagicTypes;

public abstract class Buffs extends Magic {
	
	private long duration;

	public Buffs(MagicTypes type, int damage,long duration,long cooldown) {
		super(type, damage,cooldown);
		this.duration=duration;
	}
	@Override
	public void affect(Champion target) {
		if(target != null || this.getTimeCast()==0 || System.currentTimeMillis()-this.getTimeCast()>=this.getCooldown()) {
			this.setTimeCast(System.currentTimeMillis());
			target.increaseHP(this.getDamage(),this.duration);
		}
	}
	public long getDuration() {
		return duration;
	}
	
	

}
