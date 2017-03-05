package arena;

import champions.Champion;
import champions.Mage;
import champions.Warrior;
import magics.Magic.MagicTypes;

public class Demo {

	
	public static void main(String[] args) {
		Champion gosho = new Mage(100, 100, 20, 0);
		Champion pesho = new Warrior(100,100,20,0);
		
		
		gosho.targetEnemy(pesho);
		gosho.castMagic(gosho.getMagic(MagicTypes.FIREBALL), pesho);

	}
}
