package champions;

import java.util.HashSet;

import magics.IMagic;

public abstract class Champion {
	
	public enum ChampionTypes{PRIEST, MAGE, WARRIOR, ROGUE}
	
	private ChampionTypes type;
	private int health;
	private int energy;
	private int dmg;
	private int armor;
	protected HashSet<IMagic> magics;
	
	public Champion(ChampionTypes type, int health, int energy, int dmg, int armor) {
		this.type = type;
		this.health = health;
		this.energy = energy;
		this.dmg = dmg;
		this.armor = armor;
		this.magics = new HashSet();
	}
	
	void attack(Champion ch){
		ch.health -= this.dmg;
	}
	
	//abstract void castMagic();
	
}
