package model.magics;

import model.champions.Champion;

public abstract class CCSpells extends Magic {
	
	private long duration;

	public CCSpells(MagicTypes type, int damage,long duration,long cooldown) {
		super(type, damage,cooldown);
		this.duration=duration;
	}
	
	@Override
	public void affect(Champion target) {
		if(target != null || this.getTimeCast()==0 || System.currentTimeMillis()-this.getTimeCast()>=this.getCooldown()) {
			this.setTimeCast(System.currentTimeMillis());
			target.crowdControlled(this.duration);
		}
	}
	public long getDuration() {
		return duration;
	}

}
