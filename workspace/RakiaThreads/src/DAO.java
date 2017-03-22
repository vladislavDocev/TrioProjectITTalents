import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DAO {
	
	private static DAO instance;
	
	private DAO(){
		
	}
	
	public static synchronized DAO getInstance(){
		if(instance == null){
			instance = new DAO();
		}
		return instance;	
	}
	public void addPerson(Person p) throws SQLException{
		String sql = "INSERT INTO persons (name, age) values (?, ?)";
		PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(sql);
		ps.setString(1, p.getName());
		ps.setInt(2, p.getAge());
		ps.execute();
		
	}
	public void addRakia(Rakia r) throws SQLException{
		String sql = "INSERT INTO rakii (date,plod,pravesht,litri) values (?, ?, ?, ?)";
		PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(sql);
		ps.setTimestamp(1, Timestamp.valueOf(r.getDate()));
		ps.setString(2, r.getType().toString());
		ps.setString(3, r.getPravesht().getName());
		ps.setInt(4, r.getLitres());
		ps.execute();
	}
	
	public Rakia allRakia() throws SQLException {
		String sql = "SELECT plod,COUNT(litri) FROM rakii GROUP BY plod";
		PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		Rakia rakia = null;
		while(res.next()){
			try{
				rakia = new Rakia(res.getString("plod"), new Pravesht(res.getString("pravesht"),100,new Kazan()), res.getInt("litri"));
			}
			catch (Exception e) {
				System.out.println("Could not create rakia...");
			}
		}
		return rakia;
		
	}
	public Pravesht getMaxRakidjiq() throws SQLException {
		String sql = "SELECT pravesht FROM rakii WHERE litri LIKE (SELECT MAX(litri) FROM rakii)";
		PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		Pravesht maxRikidiq = null;
		while(res.next()){
			try{
				maxRikidiq = new Pravesht(res.getString("pravesht"), 100, new Kazan());
			}
			catch (Exception e) {
				System.out.println("Could not create rakia...");
			}
		}
		return maxRikidiq;
	}
	public Berach getYoungestBerach() throws SQLException {
		String sql = "SELECT name FROM persons WHERE age LIKE (SELECT MAX(age) FROM persons)";
		PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		Berach youngest = null;
		while(res.next()){
			try{
				youngest = new Berach(res.getString("name"), 100, new Kazan());
			}
			catch (Exception e) {
				System.out.println("Could not create rakia...");
			}
		}
		return youngest;
	}

}
