package immigrants;

import immigrants.City.CityNames;

import java.util.ArrayList;

public abstract class Immigrant implements Comparable{
	public enum SomeNames { 
		IVAN("IVAN"),
		GOSHO("GOSHO"),
		VOLIO("VOLIO"),
		TARIKATIMMIGRANT("TARIKATIMMIGRANT"),
		IMMIGRANTCHE("IMMIGRANTCHE");
		
		private String name;
		SomeNames(String s) {
			this.name=s;
		}
		public String toString() {
			return this.name;
		}
	}
	
	private String name;
	private int money;
	private City city;
	private Country country;
	private ArrayList<Immigrant> relatives;
	
	public Immigrant(String name, int money) {
		this.name = name;
		this.money = money;
		Country country = new Country("Pakistan",city);
		this.country=country;
		this.city=new City(CityNames.values()[0].toString(),5000,country);
		this.relatives=new ArrayList<Immigrant>();
	}

	public abstract void buyWeapon(Weapon weapon) throws Exception;
	
	public String getName() {
		return this.name;
	}
	
	public void setRelative(Immigrant i) {
		this.relatives.add(i);
	}
	
	public City getCity() {
		return this.city;
	}
	public Country getCountry() {
		return this.country;
	}
	public int getMoney() {
		return this.money;
	}
	public abstract boolean getPassport();

	public void immigrateTo(Country country, City city) {
		if(!this.getCountry().equals(country) && !this.getCity().equals(city)) {
			this.country=country;
			this.city=city;
			Police police = this.city.getPolice();
			if(police instanceof PoliceOfficer) {
				PoliceOfficer po = (PoliceOfficer)police;
				if(po.checkImmigrant(this)) {
					this.city.addImmigrant(this);
				}
				else {
					if(po.catchImmigrant(this)){
						System.out.println("Police Officer: " + po.getName() +  "successfully captured Immigrant: " +  this.name);
					}
					else {
						System.out.println("Police Officer: " + po.getName() +  "failed to capture Immigrant: " +  this.name + "! He now lives in this city");
						this.city.addImmigrant(this);
					}
				}
			}
			else if(police instanceof SpecOfficer) {
				SpecOfficer so = (SpecOfficer)police;
				if(this instanceof Normal) {
					this.city.addImmigrant(this); // Normal immigrants are added to city
				}
				else {
					SpecImmigrant spec = (SpecImmigrant) this;
				if(so.checkImmigrant(spec)) {
					this.city.addImmigrant(this);
				}
				else {
					if(so.catchImmigrant(spec)){
						System.out.println("Spec Officer: " + so.getName() +  "successfully captured Immigrant: " +  this.name);
					}
					else {
						System.out.println("Spec Officer: " + so.getName() +  "failed to capture Immigrant: " +  this.name + "! He now lives in this city");
						this.city.addImmigrant(this);
						}
					}
				}
			}
			for (int i = 0; i < relatives.size(); i++) {
				if(!relatives.get(i).getCountry().equals(country) && !relatives.get(i).getCity().equals(city)) {
					relatives.get(i).immigrateTo(country, city);
				}
			}
		}
	}

	public abstract int fire() throws Exception;

	@Override
	public String toString() {
		return "Immigrant [name=" + name + ", money=" + money + "]";
	}

}
