package immigrants;

import java.util.Random;

public class Automat extends Weapon {

	public Automat(int i, int nextInt) {
		super(i,nextInt);
	}

	@Override
	public int fireWeapon() {
		int shotsFired = new Random().nextInt(this.getQuantity());
		System.out.println("Firing with Automat! Shots fired : " + shotsFired);
		return shotsFired;
	}

}
