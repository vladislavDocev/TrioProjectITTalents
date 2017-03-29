package extendsPerson;

public class Employee extends Person {
	private double daySalary;
	
	Employee(String name,int age,boolean isMale,double daySalary) {
		super(name,age,isMale);
		this.daySalary=daySalary;
	}
	double calculateOvertime(double hours) {
		if(this.getAge()<18) {
			return 0;
		}
		else {
			return hours*1.5*(this.daySalary/8);
		}
	}
	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary:"+this.daySalary);
	}

}
