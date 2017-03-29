package immigrants;

import immigrants.Immigrant.SomeNames;

import java.util.ArrayList;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		
		Country country = new Country("England",5);
		ArrayList<Immigrant> newWave = new ArrayList<Immigrant>();
		
		for (int i = 0; newWave.size() <= 100; i++) {
			int newPercent = new Random().nextInt(100);
			if(newPercent<25) {
				Radical rad = new Radical(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
						,new Random().nextInt(500));
				int chancePassport = new Random().nextInt(100);
				if(chancePassport<35) {
				rad.setPassport(new Passport(rad.getName(),new Random().nextInt(80),rad.getCity(),rad.getCountry()));
				if(newWave.size()<3) {
					rad.setRelative(new Radical(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(500)));
					rad.setRelative(new Radical(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(500)));
				}
				else {
				int countRelatives=0;
				while(countRelatives<2) {
				Immigrant relative = newWave.get(new Random().nextInt(newWave.size()-1));
				if(!relative.equals(rad)) {
				rad.setRelative(relative);
				countRelatives++;
						}
					}
				}
				newWave.add(rad);
				
			}
		}
			else if(newPercent<60) {
				Extremist ext = new Extremist(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
						,new Random().nextInt(5000));
				if(newWave.size()<3) {
					ext.setRelative(new Extremist(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(5000)));
					ext.setRelative(new Extremist(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(5000)));
				}
				else {
				int countRelatives=0;
				while(countRelatives<2) {
				Immigrant relative = newWave.get(new Random().nextInt(newWave.size()-1));
				if(!relative.equals(ext)) {
					ext.setRelative(relative);
				countRelatives++;
						}
					}
				}
				newWave.add(ext);
			}
			else if(newPercent<100) {
				Normal nor = new Normal(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
						,new Random().nextInt(500));
				nor.setPassport(new Passport(nor.getName(),new Random().nextInt(80),nor.getCity(),nor.getCountry()));
				if(newWave.size()<3) {
					nor.setRelative(new Normal(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(500)));
					nor.setRelative(new Normal(SomeNames.values()[new Random().nextInt(SomeNames.values().length)].toString()
							,new Random().nextInt(500)));
				}
				else {
				int countRelatives=0;
				while(countRelatives<2) {
				Immigrant relative = newWave.get(new Random().nextInt(newWave.size()-1));
				if(!relative.equals(nor)) {
					nor.setRelative(relative);
				countRelatives++;
						}
					}
				}
				newWave.add(nor);
			}
		}
		
		ArrayList<Weapon> newWeapons = new ArrayList<Weapon>();
		for (int i = 0; newWeapons.size() <=200; i++) {
			int chanceToGetWeapon = new Random().nextInt(3);
			switch (chanceToGetWeapon) {
			case 0 : Weapon weapon = new Pistol(new Random().nextInt(300)+200,new Random().nextInt(200));
			newWeapons.add(weapon);
			break;
			case 1 : Weapon weapon1 = new Bomb(new Random().nextInt(1000)+500,new Random().nextInt(5));
			newWeapons.add(weapon1);
			break;
			case 2 : Weapon weapon2 = new Automat(new Random().nextInt(400)+300,new Random().nextInt(350));
			newWeapons.add(weapon2);
			break;
			}
		}
		System.out.println("----------");
		System.out.println("BUYING WEAPONS");
		for (int i = 0; i < newWave.size(); i++) {
			for(int j=0;j<5;j++) {
			try { int weaponIDX = new Random().nextInt(newWeapons.size());
			if(newWeapons.get(weaponIDX) instanceof Bomb) {
				if(newWave.get(i) instanceof Extremist) {
					newWave.get(i).buyWeapon(newWeapons.get(weaponIDX));
				}
				else {
					continue;
				}
			}
			else {
				newWave.get(i).buyWeapon(newWeapons.get(weaponIDX));
				 newWeapons.remove(weaponIDX);
			}
				}
			catch(Exception e) {
				e.printStackTrace();
				newWave.remove(i);
				break;
				}
			}
		}
		System.out.println("----------");
		System.out.println("IMMIGRATION BEGIN");
		for (int i = 0; i < newWave.size(); i++) {
			newWave.get(i).immigrateTo(country,country.getCity());
		}
		newWave = new ArrayList<Immigrant>();
		for (int i = 0; i < country.getCities().size(); i++) {
			newWave.addAll((country.getCities().get(i).getImmigrants()));
		}
		System.out.println("----------");
		System.out.println("AFTER IMMIGRATION");
		System.out.println(newWave);
		System.out.println("----------");
		System.out.println("BEGIN TERRORRISM");
		for (int i = 0; i < 20; i++) {
			Immigrant im = newWave.get(new Random().nextInt(newWave.size()));
			City city = country.getCity();
			try {
				if(city!=null) {
				im.fire();
				city.removePopulation(im.fire());
				}
				else {
					System.out.println("City is NULL");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(city.getName() + " Exploded and is now in ruins");
				country.getCities().remove(city);
				System.out.println(im + " SURVIVED EXPLOSION AND JOINS THE COUNTRIES LIST OF IMMIGRANTS SURVIVED EXPLOSION");
				country.getExplodedBombImmigrants().add(im);
			}
		}
		System.out.println("SORTED CITIES BY POPULATION:");
		country.getSortedSurvivalCities();
		System.out.println("SORTED IMMIGRANTS BY MONEY:");
		country.getSortedMoneyImmigrants();
		System.out.println("IMMIGRANTS SURVIVED EXPLOSION:");
		System.out.println(country.getExplodedBombImmigrants());
		

	}


}
