package immigrants;

public class Passport {
	
	private String name;
	private int age;
	private City city;
	private Country country;

	public Passport(String name, int nextInt, City city, Country country) {
		this.name=name;
		this.age = nextInt;
		this.city=city;
		this.country = country;
	}

}
