package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import model.user.User;

public class UserDAO {
	
	private static UserDAO instance;
	private static final HashMap<String, User> allUsers = new HashMap<>();//username - > user
	
	private UserDAO(){
		
	}
	
	public static synchronized UserDAO getInstance(){
		if(instance == null){
			instance = new UserDAO();
		}
		return instance;	
	}
	
	public void addUser(User u) throws SQLException{
		//TODO insert into DB
		String sql = "INSERT INTO users (name, username, password, email) values (?, ?, ?, ?)";
		PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
		st.setString(1, u.getName());
		st.setString(2, u.getUsername());
		st.setString(3, u.getPass());//TODO hash pass
		st.setString(4, u.getEmail());
		st.execute();
		ResultSet res = st.getGeneratedKeys();
		res.next();
		long id = res.getLong(1);
		u.setId(id);
		allUsers.put(u.getUsername(), u);
	}
	
	public HashMap<String, User> getAllUsers() throws SQLException{
		if(allUsers.isEmpty()){
			String sql = "SELECT user_id, name, username, password FROM users;";
			PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
			ResultSet res = st.executeQuery();
			while(res.next()){
				User u = null;
				try {
					u = new User(res.getString("name"), res.getString("password"), res.getString("username"), res.getString("email"));
				} catch (Exception e) {
					System.out.println("Could not creare user.");
				}
				u.setId(res.getLong("id"));
				allUsers.put(u.getUsername(), u);
			}
		}
		return allUsers;
	}

	public synchronized boolean validLogin(String user, String pass) throws SQLException {
		if(getAllUsers().containsKey(user)){
			return getAllUsers().get(user).getPass().equals(pass);
		}
		return false;
	}
}
