package carTask;
public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	int currentGear;
	String color;
	String licencePlate;
	Person owner;
	
	Car(String model) {
		this.model=model;
	}
	
	void accelerate(){
		if(currentSpeed < maxSpeed){
			currentSpeed++;
		}
	}
	
	void changeGearUp(){
		if(currentGear < 5){
			currentGear++;
		}
	}
	void changeGearDown(){
		if(currentGear > 1){
			currentGear--;
		}
	}
	void changeGear(int nextGear) {
		if(nextGear >= 1 && nextGear <= 5){
			currentGear = nextGear;
		}
	}
	void changeColor(String newColor){
		color = newColor;
	}
	@Override
	public String toString() {
		return "Model: " + this.model + " ,Owner: " + this.owner;
	}

}
