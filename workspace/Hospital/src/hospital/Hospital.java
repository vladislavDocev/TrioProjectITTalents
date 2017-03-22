package hospital;

import hospital.Doctor.Specialization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;

public class Hospital {
	
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<Nurse> nurses;
	private HashSet<Patient> patients;
	private ArrayList<Place> places;	
	
	public Hospital(String name) {
		this.name = name;
		this.doctors = new ArrayList<Doctor>();
		this.nurses = new ArrayList<Nurse>();
		this.patients = new HashSet<Patient>();
		this.places = new ArrayList<Place>();
		this.places.add(new Orthopedy());
		this.places.add(new Cardiology());
		this.places.add(new Virusology());
		for (int i = 0; i < places.size(); i++) {
			for(int j = 1 ; j<=10 ;j++){
			this.places.get(i).getFreePlaces().put(j, 3);
			}
		}
		Doctor newDoctor = new Doctor("NewDoctor","148934058",Specialization.CARDIOLOGY);
		this.doctors.add(newDoctor);
		Nurse newNurse =new Nurse("NewNurse",15,"81757251");
		this.nurses.add(newNurse);
		newDoctor.setNurse(newNurse);
	}
	
	public void acceptPatient(Patient p) {
		this.patients.add(p);
		boolean flag=false;
		for (int i = 0; i < this.doctors.size(); i++) {
			if(doctors.get(i).getPatient() == false) {
				p.setDoctor(doctors.get(i));
				doctors.get(i).setPatient(p);
				String placeToGo = doctors.get(i).makeTreatment(p);
				mainloop : for (int j = 0; j < places.size(); j++) {
					if(places.get(j).getName().equals(placeToGo)) {

						boolean flag2 = false;
						for(Entry<Integer, Integer> e : places.get(j).getFreePlaces().entrySet()) {
							if(e.getValue()>0) {
								System.out.println("Successfully bedded patient " + p.getName() + " in department " + places.get(j).getName() + " Room number: " + e.getKey() + " Bed number: " + e.getValue());
								int newValueBed = e.getValue()-1;
								e.setValue(newValueBed);
								p.setRoomId(e.getKey());
								p.setBedId(newValueBed);
								flag2=true;
								break;
							}
						}
						if(!flag2) {
							System.out.println("There are no free rooms and beds in department " + places.get(i).getName());
						}
						break mainloop;
						
					}
					else if(placeToGo.equals("OTHER")) {
						System.out.println("Patient has diagnosis, unknown for this software and we will put him in ER");
						break mainloop;
					}
				}
				flag=true;
				
			}
			
		}
		if(!flag) {
			System.out.println("There is no available doctor at the moment. Please wait.");
		}
	}

}
