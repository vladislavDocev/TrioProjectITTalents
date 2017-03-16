package champions;

import java.util.HashMap;
import java.util.HashSet;

import magics.Magic;
import magics.Magic.MagicTypes;

public abstract class Champion {

	public enum ChampionTypes {
		PRIEST, MAGE, WARRIOR, ROGUE
	}

	private ChampionTypes type;
	private int health;
	private int energy;
	private int dmg;
	private int armor;
	protected HashMap<MagicTypes,Magic> magics;
	protected Champion enemy;
	protected Champion ally;
	public boolean invulnurability;
	public boolean isCrowControlled;
	private static int MAX_HEALTH;
	private boolean silenced;

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
		this.silenced=false;
		this.magics = new HashMap<>();
	}

	void attack(Champion ch) {
		ch.health -= this.dmg;
	}

	// abstract void castMagic(Magic magic, Champion target);
	 
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
