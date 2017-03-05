package champions;

import java.util.HashMap;
import java.util.HashSet;

import magics.IAllySpells;
import magics.IEnemySpells;
import magics.IMagic;
import magics.ISelfCastSpells;
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
	protected HashMap<MagicTypes, IMagic> magics;
	protected Champion enemy;
	protected Champion ally;
	private boolean isUntargetable;
	private boolean invulnurability;
	private boolean isCrowControlled;
	private int maxHP;

	public Champion(ChampionTypes type, int health, int energy, int dmg, int armor) {
		this.type = type;
		if (health > 0) {
			maxHP = health;
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
		this.isUntargetable = false;
		this.magics = new HashMap<>();
	}

	void attack(Champion ch) {
		ch.health -= this.dmg;
	}

	public void castMagic(IMagic magic, Champion target) {
		 if (!this.isCrowControlled) {
				if (this.magics.containsKey(magic.getType())) {
					if (target != null) {
						if (target.equals(this.enemy)) {
							if (magic instanceof IEnemySpells) {
								magic.affect(target);
							} else {
								System.out.println("Invalid target");
							}
						} else {
							if (target.equals(this)) {
								if (magic instanceof ISelfCastSpells) {
									magic.affect(target);
								} else {
									System.out.println("Invalid target");
								}
							} else {
								if (target.equals(this.ally)) {
									if (magic instanceof IAllySpells) {
										magic.affect(target);
									} else {
										System.out.println("Invalid target");
									}
								}
							}
						}
					}
				}
			}else{
				System.out.println("Cannot cast while crowd controlled.");
			}
	 }
	 
	public void targetEnemy(Champion champion) {
		 if(champion != null) {
			 this.enemy = champion;
		 }
	 }
	 
	public void targetAlly(Champion champion) {
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
		if(this.health > maxHP) {
			this.health = maxHP;
		}
	}

	public void getShielded(int shield) {
		this.health += shield;
	}

	public void becomeUntargettable() {
		this.isUntargetable = true;
	}

	public void becomeInvulnurable() {
		this.invulnurability = true;
	}

	public IMagic getMagic(MagicTypes magicType) {
		IMagic magic = null;
		if(this.magics.containsKey(magicType)){
			magic = this.magics.get(magicType);
		}
		return magic;
	}
}
