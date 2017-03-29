package carTask;

import java.util.ArrayList;

public class CarShop {
	int capacity;
	ArrayList<Car> cars= new ArrayList<Car>();
	
	CarShop(int capacity) {
		this.capacity=capacity;
	}
	boolean addCar(Car car) {
		if(this.cars.size()<this.capacity) {
			this.cars.add(car);
			return true;
		}
		else {
			return false;
		}
		
	}
	Car getNextCar() {
		return this.cars.get(this.cars.size()-1);
	}
	boolean removeCar(Car car) {
		if(this.cars.size()>0) {
			this.cars.remove(this.cars.size()-1);
			return true;
		}
		else {
			return false;
		}
	}
	void sellNextCar(Person buyer) {
		buyer.car=(this.getNextCar());
		this.getNextCar().owner=buyer;
		if(removeCar(this.getNextCar()));
	}	
	void showAllCarsInTheShop() {
		for (int i = 0; i < this.cars.size(); i++) {
			System.out.println(this.cars.get(i));
		}
	}

}
