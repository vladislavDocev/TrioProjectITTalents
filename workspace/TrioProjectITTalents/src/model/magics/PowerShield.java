package model.magics;

import model.champions.Champion;

public class PowerShield extends Buffs {

	public static final int POWERSHIELD_BASE_AMAOUNT = 40;
	
	public PowerShield() {
		super(MagicTypes.POWERSHIELD,POWERSHIELD_BASE_AMAOUNT,45000,60000);
		
	}

	
}
