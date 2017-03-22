package hospital;

import java.util.HashMap;

public abstract class Place {
	
	private HashMap<Integer,Integer> freePlaces;
	private String name;
	
	public Place() {
		this.freePlaces=new HashMap<Integer,Integer>();
	}
	
	public HashMap<Integer, Integer> getFreePlaces() {
		return freePlaces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
