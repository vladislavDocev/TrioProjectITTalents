package library;

import java.time.LocalDate;

import library.Library.readMaterialType;

public class Textbook extends ReadMaterial {
	
	public enum textBookCategory {
		HISTORY("HISTORY"),
		GEOGRAPHY("GEOGRAPHY"),
		JAVA("JAVA"); 
		
		private final String name;
		
		private textBookCategory(String s) {
			this.name=s;
		}
		 public String toString() {
		       return this.name;
		    }
	}
	
	public Textbook(String name, String author, String publisher, LocalDate dateOfPublish, textBookCategory category) {
		super(name, author, publisher, dateOfPublish, category.toString());
		this.setType(readMaterialType.TEXTBOOKS);
	}






	@Override
	public int compareTo(Object o) {
		Textbook tb = (Textbook) o;
		return this.getName().compareTo(tb.getName());
	}

}
