package hospital;

import java.util.ArrayList;

public class Treatment {
	
	public enum Diagnosis {
		FLU("Virusology"),
		HEARTACHE("Cardiology"),
		LEGPAIN("Orthopedy"),
		OTHER("OTHER");
		
		private String placeForTreatmentName;
		private Diagnosis(String s) {
			this.placeForTreatmentName=s;
		}
		public String placeForTreatment() {
			return this.placeForTreatmentName;
		}
		
	}
	
	private ArrayList<Medication> meds;
	private int duration;
	
	public Treatment(Diagnosis diagnosis) {
		if(diagnosis.equals(Diagnosis.FLU)) {
			this.meds = new ArrayList<Medication>();
			this.meds.add(new Medication("Antibiotics for Flu","Treat FLU"));
			this.duration=3;
		}
		else if(diagnosis.equals(Diagnosis.HEARTACHE)) {
			this.meds = new ArrayList<Medication>();
			this.meds.add(new Medication("Cure for Heart Ache","Treat HEARTACHE"));
			this.duration=5;
		}
		else if(diagnosis.equals(Diagnosis.LEGPAIN)) {
			this.meds = new ArrayList<Medication>();
			this.meds.add(new Medication("Cure for Leg Pain","Treat LEGPAIN"));
			this.duration=3;
		}
		else if(diagnosis.equals(Diagnosis.OTHER)) {
			this.meds = new ArrayList<Medication>();
			this.meds.add(new Medication("Medication for Other diagnosis","Treat OTHER"));
			this.duration=5;
		}
		
	}
	
	@Override
	public String toString() {
		return "Treatment [Medications=" + meds
				+ ", Duration of Treatment=" + duration + "]";
	}



	private class Medication {
		private String name;
		private String use;
		
		private Medication(String name,String use) {
			this.name=name;
			this.use=use;
		}

		@Override
		public String toString() {
			return "Medication [Name=" + name + ", Use=" + use + "]";
		}
		
	}



	public ArrayList<Medication> getMeds() {
		return meds;
	}

	public int getDuration() {
		return this.duration;
	}

}
