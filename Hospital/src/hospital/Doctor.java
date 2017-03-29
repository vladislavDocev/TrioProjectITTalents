package hospital;

import hospital.Treatment.Diagnosis;

import java.util.Random;

public class Doctor {
	
	public enum Specialization { 
		ORTHOPEDY("Orthopedy"),
		CARDIOLOGY("Cardiology"),
		VIRUSOLOGY("Virusology");
		private String nameSpec;
		
		private Specialization(String s) {
			this.nameSpec=s;
		}
		public String toString() {
			return this.nameSpec;
		}
		
	}
	
	private String name;
	private String number;
	private Specialization spec;
	private Patient p;
	private Nurse n;
	
	public Doctor(String name, String number, Specialization spec) {
		this.name = name;
		this.number = number;
		this.spec = spec;
	}

	public String makeTreatment(Patient p) {
		Diagnosis d =Diagnosis.values()[new Random().nextInt(Diagnosis.values().length)];
		Treatment treatment = new Treatment(d);
		p.getPlanForTreatment().put(d,treatment);
		p.setDiagnosis(d);
		for(int i=1;i<=treatment.getDuration();i++){
			this.visitPatient(i);
			this.n.giveMedicine(this.p);
		}
		return d.placeForTreatment();
	}
	
	public void visitPatient(int times) {
		System.out.println(times + " Visit for doctor " + this.name + " to patient " + this.p.getName());
	}

	public boolean getPatient() {
		if(this.p==null) {
		return false;
		}
		return true;
	}

	public void setPatient(Patient p) {
		this.p=p;
	}

	public Nurse getNurse() {
		return n;
	}

	public void setNurse(Nurse n) {
		this.n = n;
	}
	
		



}
