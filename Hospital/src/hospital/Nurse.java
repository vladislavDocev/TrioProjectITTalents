package hospital;

public class Nurse {
	
	private String name;
	private int experience;
	private String number;
	
	public Nurse(String name, int experience, String number) {	super();
		this.name = name;
		this.experience = experience;
		this.number = number;
	}
	
	public void giveMedicine(Patient p) {
		System.out.println(this.getName() + " gives medicine " + p.getPlanForTreatment().get(p.getDiagnosis()).getMeds());
	}

	public String getName() {
		return name;
	}
	

}
