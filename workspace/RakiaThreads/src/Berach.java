import java.sql.SQLException;
import java.util.Random;

public class Berach extends Person implements Runnable {
	
	private PLODOVE typePlod;
	private Kazan kazan;
	
	public Berach(String name, int age,Kazan kazan) {
		super(name, age);
		this.typePlod=PLODOVE.values()[new Random().nextInt(PLODOVE.values().length)];
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
			if(kazan.getTypeRakia()==null) {
				kazan.setTypeRakia(this.typePlod);
			}
			if(this.typePlod.equals(kazan.getTypeRakia())) {
				System.out.println(this.getName() + " dobavi 1 kg plod " + kazan.getTypeRakia() + " v kazana" );
				kazan.addPlodove();
			}
			else {
				System.out.println(this.getName() + " se opita da dobavi " + this.typePlod + " plodove v kazan s " + kazan.getTypeRakia() + " i sega shte pochiva 7 sekundi");
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					System.out.println("Ops "  + e.getMessage()) ;
				}
			}
		}
	}

}
