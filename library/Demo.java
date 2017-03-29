package library;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import library.Book.bookGenre;
import library.Magazine.magazineCategory;
import library.Textbook.textBookCategory;
import library.Library.readMaterialType;

public class Demo {
	
	public static void main(String[] args) {
		
	  HashMap< readMaterialType ,   TreeMap< String   ,	TreeSet<ReadMaterial> > > readable = new HashMap< readMaterialType ,   TreeMap< String   ,	TreeSet<ReadMaterial> > >();
	  Book b1 = new Book("Book","Author","Publisher",LocalDate.now(),bookGenre.ACTION);
	  Magazine m1 = new Magazine("Magazine","Author","Publisher",LocalDate.now(),magazineCategory.LIFESTYLE);
	  Textbook tb1 = new Textbook("Textbook","Author","Publisher",LocalDate.now(),textBookCategory.GEOGRAPHY);
	  Textbook tb2 = new Textbook("JAVA","Author","Publisher",LocalDate.now(),textBookCategory.JAVA);
	  Library l = new Library("Library");
	  
	  addReadingObj(b1,l);
	  addReadingObj(m1,l);
	  addReadingObj(tb1,l);
	  addReadingObj(tb2,l);
	  System.out.println(l.getReadable());
	}
	
	public static void addReadingObj(ReadMaterial rm,Library l) {
		String category = rm.getCategory();
		if(l.getReadable().containsKey(rm.getType())) {
			for(Entry<readMaterialType, TreeMap<String, TreeSet<ReadMaterial>>> e : l.getReadable().entrySet()) {
				for(Entry<String, TreeSet<ReadMaterial>> e1 : e.getValue().entrySet()) {
					if(e1.getKey().equals(category)) {
						e1.getValue().add(rm);
					}
					else {
						TreeSet<ReadMaterial> newSet = new TreeSet<ReadMaterial>();
						newSet.add(rm);
						e.getValue().put(category,newSet);
					}
				}
			}
		}
		else {
				TreeSet<ReadMaterial> treeSet = new TreeSet<ReadMaterial>();
				treeSet.add(rm);
				TreeMap<String   ,	TreeSet<ReadMaterial> > tm = new TreeMap< String   ,	TreeSet<ReadMaterial> >();
				tm.put(rm.getCategory(), treeSet);
				l.getReadable().put(rm.getType() , tm);
		}
		
	}

}
