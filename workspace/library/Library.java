package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import library.Library.readMaterialType;

public class Library {
	
	public enum readMaterialType {
		BOOKS("BOOKS"),
		MAGAZINES("MAGAZINES"),
		TEXTBOOKS("TEXTBOOKS"); 
		
		private final String name;
		
		
		private readMaterialType(String s) {
			this.name=s;
		}
		 public String toString() {
		       return this.name;
		    }
		 
	}
	
	private HashMap< readMaterialType ,   TreeMap< String   ,	TreeSet<ReadMaterial> > > readable;
	private String name;
	
	public void takeReadMaterial(readMaterialType type,String category,String name) {
		for (Map.Entry<readMaterialType,TreeMap< String   ,	TreeSet<ReadMaterial> > > e : readable.entrySet()) {
			if(e.getKey().toString().equals(type.toString())) {
				for(Map.Entry<String, TreeSet<ReadMaterial>> e1 : e.getValue().entrySet()) {
					if(e1.getKey().equals(category)) {
						for(ReadMaterial rm : e1.getValue()) {
							if(rm.getName().equals(name)) {
								e1.getValue().remove(rm);
							}
						}
					}
				}
			}
		}
	}
	public void returnReadMaterial(ReadMaterial rm) {
		for (Map.Entry<readMaterialType,TreeMap< String   ,	TreeSet<ReadMaterial> > > e : readable.entrySet()) {
			if(e.getKey().toString().equals(rm.getCategory().toString())) {
				for(Map.Entry<String, TreeSet<ReadMaterial>> e1 : e.getValue().entrySet()) {
					if(e1.getKey().equals(rm.getCategory())) {
								e1.getValue().add(rm);
					}
				}
			}
		}
		
	}

	
	
	public Library(String name) {
		this.name=name;
		this.readable=new HashMap< readMaterialType ,   TreeMap< String   ,	TreeSet<ReadMaterial> > >();
		
	}
	public HashMap<readMaterialType, TreeMap<String, TreeSet<ReadMaterial>>> getReadable() {
		return readable;
	}
	public void setReadable(HashMap<readMaterialType, TreeMap<String, TreeSet<ReadMaterial>>> readable) {
		this.readable = readable;
	}
	
	
	


}
