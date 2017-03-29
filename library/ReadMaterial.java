package library;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import library.Library.readMaterialType;

public abstract class ReadMaterial implements Comparable {
	
	private String name;
	private String author;
	private String publisher;
	private LocalDate dateOfPublish;
	private String category;
	private TreeMap<LocalDate,LocalDate> history;
	private readMaterialType type;
	
	public ReadMaterial(String name, String author, String publisher, LocalDate dateOfPublish, String category) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.dateOfPublish = dateOfPublish;
		this.category = category;
		this.history=new TreeMap<LocalDate,LocalDate>();
	}
	
	
	public void setType(readMaterialType type) {
		this.type = type;
	}


	public String getCategory() {
		return category;
	}
	
	public readMaterialType getType() {
		
		return type;
		
	}
// switch (this.type) {
//case "BOOKS" : return readMaterialType.BOOKS ;
//case "MAGAZINES" : return readMaterialType.MAGAZINES ;
//case "TEXTBOOKS" : return readMaterialType.TEXTBOOKS ;
//default : return null;

	public LocalDate getDateOfPublish() {
		return dateOfPublish;
	}

	public String getName() {
		return name;
	}

	public TreeMap<LocalDate, LocalDate> getHistory() {
		return history;
	}

	public void setHistory(TreeMap<LocalDate, LocalDate> history) {
		this.history = history;
	}


	@Override
	public String toString() {
		return "ReadMaterial [name=" + name + ", author=" + author + ", dateOfPublish=" + dateOfPublish + "]";
	}
	
	
	

}
