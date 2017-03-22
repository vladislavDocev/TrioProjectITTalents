import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	private static DBManager instance;
	private Connection con = null;
	private static final String IP = "0,0,0,0";
	private static final String PORT = "3306";
	private static final String USER = "root";
	private static final String PASS = "pass";
	 	
	public DBManager() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance(); // Instantiate DRIVER
		} catch (InstantiationException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		} catch (IllegalAccessException e1) {
			System.out.println("Ops "  + e1.getMessage()) ;
		} catch (ClassNotFoundException e2) {
			System.out.println("Ops "  + e2.getMessage()) ;
		} 
		
		try {
			this.con = DriverManager.
						getConnection("jdbc:mysql://" + IP + ":" + PORT + "/MyDatabase", USER, PASS);
		} catch (SQLException e3) {
			System.out.println("Ops "  + e3.getMessage()) ;
		}
	}
	
	public static synchronized DBManager getInstance(){
		if(instance == null){
			instance = new DBManager();
		}
		return instance;
	}
	
	public Connection getConnection(){
		return con;
	}

	
	
}
