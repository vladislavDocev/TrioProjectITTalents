package immigrants;

import immigrants.City.CityNames;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Country {
	
	private String name;
	private ArrayList<City> cities;
	private ArrayList<Immigrant> bombExplodeSurvivals;

	public Country(String string, int i) {
		this.name=string;
		this.cities=new ArrayList<City>();
		int cityIdx=1;
		for (int j = 0; this.cities.size() < 5; j++) {
			if(cityIdx<CityNames.values().length){
			cities.add(new City(CityNames.values()[cityIdx].toString(),71283,this));
			cityIdx++;
			}
		}
		System.out.println(cities);
		this.bombExplodeSurvivals = new ArrayList<Immigrant>();
		
	}

	public Country(String string,City c) {
		this.name=string;
		this.cities=new ArrayList<City>();
		cities.add(c);
	}
	
	public City getCity() {
		if(this.cities.size()>0) {
		int randomCityIdx = new Random().nextInt(this.cities.size());
		return this.cities.get(randomCityIdx);
		}
		return null;
	}
	
	
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		Country c = (Country) obj;
		return this.name.equals(c.name);
	}

	public void removeCity(City city) {
		for (int i = 0; i < this.cities.size(); i++) {
			if(this.cities.get(i).equals(city)) {
				this.cities.remove(i);
			}
		}
	}

	public City getCity(City city) {
		for (int i = 0; i < this.cities.size(); i++) {
			if(this.cities.get(i).equals(city)) {
				return this.cities.get(i);
			}
		}
		return null;
	}

	public void getSortedSurvivalCities() {
		TreeSet<City> sortedSurvivalCities = new TreeSet<City>();
		sortedSurvivalCities.addAll(cities);
		System.out.println(sortedSurvivalCities);
	}

	public void getSortedMoneyImmigrants() {
		TreeSet<Immigrant> sortedMoneyImmigrants = new TreeSet<Immigrant>();
		for (int i = 0; i < cities.size(); i++) {
			sortedMoneyImmigrants.addAll(cities.get(i).getImmigrants());
		}
		System.out.println(sortedMoneyImmigrants);
	 }

	public ArrayList<Immigrant> getExplodedBombImmigrants() {
		return this.bombExplodeSurvivals;
	}

	public ArrayList<City> getCities() {
		return this.cities;
	}

	
	

}
