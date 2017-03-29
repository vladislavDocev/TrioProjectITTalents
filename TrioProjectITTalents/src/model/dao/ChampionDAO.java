package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import model.champions.Champion;
import model.champions.Mage;
import model.champions.Priest;
import model.champions.Rogue;
import model.champions.Warrior;

public class ChampionDAO {

	private static ChampionDAO instance;
	private static final HashMap<String, Champion> allChampions = new HashMap<>();

	private ChampionDAO() {

	}

	public static synchronized ChampionDAO getInstance() {
		if (instance == null) {
			instance = new ChampionDAO();
		}
		return instance;
	}

	public Mage getMage() throws SQLException {

		String sql = "select c.health,c.energy,c.damage,s.name from champions c" + "\n"
				+ "inner join classes s on s.class_id = c.class_id AND s.name = " + "\""+"Mage"+"\"" + ";";

		PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = st.executeQuery();
		int health = 0;
		int energy = 0;
		int damage = 0;
		while(res.next()) {
			health = res.getInt(1);
			energy = res.getInt(2);
			damage = res.getInt(3);
			
		}
		Mage c = new Mage(health, energy, damage);
		return c;
	}
	
	public Rogue getRogue() throws SQLException {

		String sql = "select c.health,c.energy,c.damage,s.name from champions c" + "\n"
				+ "inner join classes s on s.class_id = c.class_id AND s.name = " + "\""+"Rogue"+"\"" + ";";

		PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = st.executeQuery();
		int health = 0;
		int energy = 0;
		int damage = 0;
		while(res.next()) {
			health = res.getInt(1);
			energy = res.getInt(2);
			damage = res.getInt(3);
			
		}
		Rogue c = new Rogue(health, energy, damage);
		return c;
	}
	
	public Priest getPriest() throws SQLException {

		String sql = "select c.health,c.energy,c.damage,s.name from champions c" + "\n"
				+ "inner join classes s on s.class_id = c.class_id AND s.name = " + "\""+"Priest"+"\"" + ";";

		PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = st.executeQuery();
		int health = 0;
		int energy = 0;
		int damage = 0;
		while(res.next()) {
			health = res.getInt(1);
			energy = res.getInt(2);
			damage = res.getInt(3);
			
		}
		Priest c = new Priest(health, energy, damage);
		return c;
	}
	
	public Warrior getWarrior() throws SQLException {

		String sql = "select c.health,c.energy,c.damage,s.name from champions c" + "\n"
				+ "inner join classes s on s.class_id = c.class_id AND s.name = " + "\""+"Warrior"+"\"" + ";";

		PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement(sql);
		ResultSet res = st.executeQuery();
		int health = 0;
		int energy = 0;
		int damage = 0;
		while(res.next()) {
			health = res.getInt(1);
			energy = res.getInt(2);
			damage = res.getInt(3);
			
		}
		Warrior c = new Warrior(health, energy, damage);
		return c;
	}

}
