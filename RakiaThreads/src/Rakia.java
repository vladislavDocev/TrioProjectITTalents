import java.sql.SQLException;
import java.time.LocalDateTime;

public class Rakia {
	
	private LocalDateTime date;
	private PLODOVE type;
	private Pravesht pravesht;
	private int litres;
	
	public Rakia(PLODOVE type, Pravesht pravesht, int litres) {
		this.date = LocalDateTime.now();
		this.type = type;
		this.pravesht = pravesht;
		this.litres = litres;
		try {
			DAO.getInstance().addRakia(this);
		} catch (SQLException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		}
	}

	public LocalDateTime getDate() {
		return date;
	}

	public PLODOVE getType() {
		return type;
	}

	public Pravesht getPravesht() {
		return pravesht;
	}

	public int getLitres() {
		return litres;
	}
	
	public Rakia(String type, Pravesht pravesht, int litres) {
		this.date = LocalDateTime.now();
		this.pravesht = pravesht;
		this.litres = litres;
		for (int i = 0; i < PLODOVE.values().length; i++) {
			if(PLODOVE.values()[i].equals(type)) {
				this.type=PLODOVE.values()[i];
			}
		}
	}

}
