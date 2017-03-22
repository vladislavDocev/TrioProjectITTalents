package immigrants;

import java.util.Random;

public class Bomb extends Weapon {

	public Bomb(int i, int nextInt) {
		super(i,nextInt);
	}
	@Override
	public int fireWeapon(){
		return 0;
	}
	public void blowUp(){
	}

}
