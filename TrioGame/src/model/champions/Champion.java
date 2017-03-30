package model.champions;

import java.util.HashMap;
import java.util.HashSet;

import model.magics.Magic;
import model.magics.Magic.MagicTypes;

public abstract class Champion {

	public enum ChampionTypes {
		PRIEST, MAGE, WARRIOR, ROGUE
	}

	private ChampionTypes type;
	private int health;
	private int energy;
	private int dmg;
	protected HashMap<MagicTypes,Magic> magics;
	protected Champion enemy;
	protected Champion ally;
	public boolean invulnurability;
	public boolean isCrowControlled;
	private static int MAX_HEALTH;
	private boolean silenced;

	public Champion(ChampionTypes type, int health, int energy, int dmg) {
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
		this.invulnurability = false;
		this.isCrowControlled = false;
		this.silenced=false;
		this.magics = new HashMap<>();
	}

	void attack(Champion ch) {
		ch.health -= this.dmg;
	}

	// abstract void castMagic(Magic magic, Champion target);
	 
	public void targetEnemy(Champion champion) {
		 if(champion != null) {
			 this.enemy = champion;
		 }
	 }
	 public String getEnemyName() {
			return enemy.getType();
		}
	 public String getType() {
		return type.toString();
	}

	public Champion getEnemy() {
		return enemy;
	}

	public void targetAlly(Champion champion) {
		 if(champion != null) {
			 this.ally = champion;
		 }
	 }

	public void reduceHP(int damage) {
		if(this.health-damage>=0) {
			this.health -= damage;
		}
		else {
			this.health=0;
		}
	}
	public void increaseDamage(int amount,long duration){
		long currentTime=System.currentTimeMillis();
		boolean isSet=false;
		while(currentTime<=currentTime+duration){
			currentTime=System.currentTimeMillis();
			if(!isSet) {
				this.dmg+=amount;
				isSet=true;
			}
		}
		this.dmg-=amount;
	}

	public void crowdControlled(long duration) {
		long currentTime=System.currentTimeMillis();
		while(currentTime<=currentTime+duration){
			currentTime=System.currentTimeMillis();
			this.isCrowControlled = true;
		}
		this.isCrowControlled=false;
	}
	public HashMap<MagicTypes, Magic> getMagics() {
		return magics;
	}

	public void setIsInvulnurable(long duration) {
		long currentTime=System.currentTimeMillis();
		while(currentTime<=currentTime+duration){
			currentTime=System.currentTimeMillis();
			this.invulnurability = true;
		}
		this.invulnurability=false;
		
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

	public void increaseHP(int damage, long duration) {
		long currentTime=System.currentTimeMillis();
		boolean isSet=false;
		while(currentTime<=currentTime+duration){
			currentTime=System.currentTimeMillis();
			if(!isSet) {
				this.increaseHP(damage);
				isSet=true;
			}
		}
		this.reduceHP(damage);
	}

	public void silence(long duration) {
		long currentTime=System.currentTimeMillis();
		boolean isSet=false;
		while(currentTime<=currentTime+duration){
			currentTime=System.currentTimeMillis();
			if(!isSet) {
				this.silenced=true;
				isSet=true;
			}
		}
		this.silenced=false;
		}
}
