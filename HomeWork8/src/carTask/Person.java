package carTask;

import java.util.ArrayList;

public class Person {
	
	String name ;
	int age ;
	char gender;
	double weight;
	int arms;
	Person friend;
	Car car;
	
	Person(String name) {
		this.name=name;
	}

	void eat(double foodWeight){
		weight+=foodWeight;
	}
	
	void growUp(int years){
		age+=years;
	}
	
	void growUp(){
		age++;
	}
	
	void sleep(int hours){
		System.out.println(name + " is sleeping for " + hours + " hours");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.name;
	}
	
}
