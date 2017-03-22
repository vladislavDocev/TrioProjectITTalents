package immigrants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class City implements Comparable {
	
	public enum CityNames {
		BANGLADESH("BANGLADESH"),
		LONDON("LONDON"),
		BIRMINGHAM("BIRMINGHAM"),
		CHELSEA("CHELSEA"),
		MANCHESTER("MANCHESTER"),
		TOTTENHAM("TOTTENHAM");
		
		private String name;
		CityNames(String s) {
			this.name=s;
		}
		public String toString() {
			return this.name;
		}
	}
	
	private String name;
	private int population;
	private ArrayList<Police> polices;
	private ArrayList<Immigrant> immigrants;
	private Country country;
	

	public City(String string,int population,Country c) {
		this.name = string;
		this.population=population;
		this.polices = new ArrayList<Police>();
		this.immigrants=new ArrayList<Immigrant>();
		this.country=c;
		this.polices.add(new PoliceOfficer("PoliceOfficer", this, this.country));
		this.polices.add(new SpecOfficer("SpecOfficer", this, this.country));
		this.polices.add(new PoliceOfficer("PoliceOfficer2", this, this.country));
		this.polices.add(new PoliceOfficer("PoliceOfficer3", this, this.country));
		this.polices.add(new PoliceOfficer("PoliceOfficer4", this, this.country));
	}
	
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}

	public void addImmigrant(Immigrant i) {
		this.immigrants.add(i);
		this.population++;
	}
	public void remove(Immigrant i) {
		this.immigrants.remove(i);
		this.population--;
	}
	
	public ArrayList<Police> getPolices() {
		return polices;
	}

	@Override
	public boolean equals(Object obj) {
		City c = (City) obj;
		return this.name.equals(c.name);
	}

	public Police getPolice() {
		int randomPoliceIdx = new Random().nextInt(this.polices.size());
		return this.polices.get(randomPoliceIdx);
	}

	public void removePopulation(int amount) {
		this.population-=amount;
	}

	@Override
	public int compareTo(Object obj) {
		return this.population-((City)obj).population;
	}

	public Collection<? extends Immigrant> getImmigrants() {
		return this.immigrants;
	}

	public String getName() {
		return this.name;
	}

}
