package immigrants;

import java.util.Random;

public class Pistol extends Weapon {

	public Pistol(int i, int nextInt) {
		super(i,nextInt);
	}
	@Override
	public int fireWeapon(){
		int shotsFired = new Random().nextInt(this.getQuantity());
		System.out.println("Firing with Pistol! Shots fired : " + shotsFired);
		return shotsFired;
	}

}
