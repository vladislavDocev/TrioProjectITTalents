package immigrants;

public abstract class Police {
	
	private String name;
	private City city;
	private Country country;
	
	public Police(String name, City city, Country country) {
		this.name = name;
		this.city = city;
		this.country = country;
	}
	public String getName() {
		return this.name;
	}
	

}
