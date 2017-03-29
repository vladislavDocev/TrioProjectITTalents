package immigrants;

import java.util.ArrayList;

public class Normal extends Immigrant {
	
	private Passport p;

	public Normal(String string, int nextInt) {
		super(string,nextInt);
	}
	
	public void setPassport(Passport p) {
		this.p=p;
	}

	@Override
	public void buyWeapon(Weapon weapon) throws Exception {
		throw new Exception("Normal immigrant can't carry Weapons");
	}

	@Override
	public boolean getPassport() {
		return false;
	}

	@Override
	public int fire() {
		System.out.println("Normal Immigrants have no weapons");
		return 0;
	}
	@Override
	public int compareTo(Object obj) {
		return this.getMoney()-((Immigrant)obj).getMoney();
	}

}
