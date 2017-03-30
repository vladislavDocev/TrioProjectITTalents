package model.magics;

import model.champions.Champion;

public class Renew extends Buffs {

	public static final int RENEW_BASE_AMAOUNT = 25;

	public Renew() {
		super(MagicTypes.RENEW,RENEW_BASE_AMAOUNT,30000,60000);

	}

}
