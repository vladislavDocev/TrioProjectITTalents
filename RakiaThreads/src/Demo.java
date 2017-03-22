import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) {
		
		Kazan kazan = new Kazan();
		Berach berach1 = new Berach("Berach1",100,kazan);
		Berach berach2 = new Berach("Berach2",100,kazan);
		Berach berach3 = new Berach("Berach3",100,kazan);
		Pravesht pravesht = new Pravesht("Pravesht",100,kazan);
		new Thread(berach1).start();
		new Thread(berach2).start();
		new Thread(berach3).start();
	
		new Thread(pravesht).start();	
		
		try {
			DAO.getInstance().getMaxRakidjiq(); 
		} catch (SQLException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		}
		try {
			DAO.getInstance().allRakia();
		} catch (SQLException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		}
		try {
			DAO.getInstance().getYoungestBerach();
		} catch (SQLException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		}
	}

}
