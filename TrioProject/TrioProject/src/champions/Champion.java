package champions;

import java.util.HashSet;

import magics.IMagic;

public abstract class Champion {

	public enum ChampionTypes {
		PRIEST, MAGE, WARRIOR, ROGUE
	}

	private ChampionTypes type;
	private int health;
	private int energy;
	private int dmg;
	private int armor;
	protected HashSet<IMagic> magics;
	protected Champion enemy;
	protected Champion ally;
	public boolean invulnurability;
	public boolean isCrowControlled;
	private static int MAX_HEALTH;

	public Champion(ChampionTypes type, int health, int energy, int dmg, int armor) {
		this.type = type;
		if (health > 0) {
			MAX_HEALTH = health;
			this.health = health;
		}
		if (energy > 0) {
			this.energy = energy;
		}
		if (dmg > 0) {
			this.dmg = dmg;
		}
		if (armor > 0) {
			this.armor = armor;
		}
		this.invulnurability = false;
		this.isCrowControlled = false;
		this.magics = new HashSet<>();
	}

	void attack(Champion ch) {
		ch.health -= this.dmg;
	}

	 abstract void castMagic(IMagic magic, Champion target);
	 
	 void targetEnemy(Champion champion) {
		 if(champion != null) {
			 this.enemy = champion;
		 }
	 }
	 
	 void targetAlly(Champion champion) {
		 if(champion != null) {
			 this.ally = champion;
		 }
	 }

	public void reduceHP(int damage) {
		this.health -= damage;
	}

	public void crowdControlled() {
		this.isCrowControlled = true;
	}

	public void increaseHP(int hp) {
		this.health += hp;
		if(this.health > MAX_HEALTH) {
			this.health = MAX_HEALTH;
		}
	}

	public void getShielded(int shield) {
		this.health += shield;
	}
}
