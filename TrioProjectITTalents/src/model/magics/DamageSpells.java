package model.magics;

import model.champions.Champion;

public abstract class DamageSpells extends Magic {

	public DamageSpells(MagicTypes type, int damage,long cooldown) {
		super(type, damage,cooldown);
	}
	@Override
	public void affect(Champion target) {
		if(target != null || this.getTimeCast()==0 || System.currentTimeMillis()-this.getTimeCast()>=this.getCooldown()) {
			this.setTimeCast(System.currentTimeMillis());
			target.reduceHP(this.getDamage());
		}
	}

}
