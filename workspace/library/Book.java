package library;

import java.time.LocalDate;

import library.Library.readMaterialType;

public class Book extends ReadMaterial {
	
	public enum bookGenre {
		ACTION("ACTION"),
		HORROR("HORROR"),
		FANTASY("FANTASY"); 
		
		private final String name;
		
		private bookGenre(String s) {
			this.name=s;
		}
		 public String toString() {
		       return this.name;
		    }
	}
		

	public Book(String name, String author, String publisher, LocalDate dateOfPublish, bookGenre category) {
		super(name, author, publisher, dateOfPublish, category.toString());
		this.setType(readMaterialType.BOOKS);
	}

	
	@Override
	public int compareTo(Object o) {
		Book b = (Book) o;
		return this.getDateOfPublish().compareTo(b.getDateOfPublish());
	}

}
