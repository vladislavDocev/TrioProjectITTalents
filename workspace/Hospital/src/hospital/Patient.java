package hospital;

import hospital.Treatment.Diagnosis;

import java.util.HashMap;

public class Patient {
	
	private String name;
	private int age;
	private String number;
	private Doctor d;
	private Place place;
	private int roomId;
	private int bedId;
	private HashMap<Diagnosis,Treatment> planForTreatment;
	private Diagnosis diagnosis;
	
	public Patient(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.planForTreatment=new HashMap<Diagnosis , Treatment>();
	}

	public HashMap<Diagnosis, Treatment> getPlanForTreatment() {
		return planForTreatment;
	}

	public void setDoctor(Doctor doctor) {
		this.d=doctor;
	}

	public String getName() {
		return this.name;
	}

	public void setRoomId(Integer key) {
		this.roomId=key;
	}

	public void setBedId(int newValueBed) {
		this.bedId=newValueBed;
	}
	
	public Diagnosis getDiagnosis() {
		return this.diagnosis;
	}
	
	public void setDiagnosis(Diagnosis d) {
		 this.diagnosis=d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	

}
