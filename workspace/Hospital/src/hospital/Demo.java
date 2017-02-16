package hospital;

public class Demo {

	public static void main(String[] args) {
		Hospital h = new Hospital("Hospital");
		Patient p = new Patient("NewPatient", 100, "56262462523");
		h.acceptPatient(p);
		Patient p2 = new Patient("NewPatient2", 100, "56262462523");
		h.acceptPatient(p2);

	}

}
