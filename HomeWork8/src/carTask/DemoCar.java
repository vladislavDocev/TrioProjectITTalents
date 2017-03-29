package carTask;

public class DemoCar {

	public static void main(String[] args) {
		CarShop cs = new CarShop(5);
		Person p1 = new Person("Petko");
		Person p2 = new Person("Default");
		Car c1 = new Car("Audi");
		Car c2=new Car("Mercedes");
		cs.addCar(c1);
		cs.addCar(c2);
		Car c3=new Car("BMW");
		cs.addCar(c3);
		cs.showAllCarsInTheShop(); // 3 cars in carShop waiting for Owner
		cs.sellNextCar(p1);
		System.out.println(p1.car); // Next car ( poslednata vkarana e prodadena na Person p1(Petko)) 
		cs.showAllCarsInTheShop();
	}

}
