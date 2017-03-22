package library;

import java.time.LocalDate;

import library.Library.readMaterialType;

public class Magazine extends ReadMaterial {
	
	public enum magazineCategory {
		NATURE("NATURE"),
		SCIENCE("SCIENCE"),
		LIFESTYLE("LIFESTYLE"); 
		
		private final String name;
		
		private magazineCategory(String s) {
			this.name=s;
		}
		 public String toString() {
		       return this.name;
		    }
	}

	private int magazineNumber;

	public Magazine(String name, String author, String publisher, LocalDate dateOfPublish, magazineCategory category) {
		super(name, author, publisher, dateOfPublish, category.toString());
		this.setType(readMaterialType.MAGAZINES);
	}

	

	@Override
	public int compareTo(Object o) {
		Magazine m = (Magazine) o;
		if(this.getName().compareTo(m.getName()) == 0) {
			return this.magazineNumber-m.magazineNumber;
		}
		return this.getName().compareTo(m.getName());
	}
}
