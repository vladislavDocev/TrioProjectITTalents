import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class Pravesht extends Person implements Runnable{
	
	private Kazan kazan;
	private static ArrayList<Rakia> rakii = new ArrayList<Rakia>();

	public Pravesht(String name, int age,Kazan kazan) {
		super(name, age);
		this.kazan = kazan;
		try {
			DAO.getInstance().addPerson(this);
		} catch (SQLException e) {
			System.out.println("Ops "  + e.getMessage()) ;
		}
	}
	

	@Override
	public void run() {
		while(true) {
			kazan.variRakia();
			int kolkoSvariha = new Random().nextInt(10)+1;
			System.out.println(this.getName() + " svari " + kolkoSvariha + " kg rakia ot " + kazan.getTypeRakia() );
			rakii.add(new Rakia(kazan.getTypeRakia(), this, kolkoSvariha));
		}
	}

}
