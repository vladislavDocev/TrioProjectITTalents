package employeeTask;

import java.util.Scanner;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;


	Employee(String name) {
		this.name=name;
		this.currentTask = new Task("", 0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		while((name.equals(null)) && (name.isEmpty())){
			System.out.println("Wrong name! Enter only chars name: ");
			Scanner sc = new Scanner(System.in);
			name=sc.nextLine();
		}
		this.name = name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		while(hoursLeft<0) {
			System.out.println("Wrong hours! Enter positive hour: ");
			Scanner sc = new Scanner(System.in);
			hoursLeft=sc.nextInt();
		}
		this.hoursLeft = hoursLeft;
		
		
	}
	void work() {
		if((this.currentTask.getName().equals(null)) || (this.currentTask.getName().isEmpty() ) ) {
			System.out.println("What would you like your employee to work on?: ");
			Scanner sc = new Scanner(System.in);
			this.currentTask.setName(sc.nextLine());
			System.out.println("How many hours will it take for the job to be complete?:");
			this.currentTask.setWorkingHours(sc.nextInt());
			System.out.println(this.currentTask.getWorkingHours());
			System.out.println("How many working hours left has the employee?:");
			this.setHoursLeft(sc.nextInt());
			System.out.println(this.getHoursLeft());
		}
		if(this.getHoursLeft()>this.currentTask.getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft()-this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
		}
		else if(this.currentTask.getWorkingHours()>this.getHoursLeft()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.getHoursLeft());
			this.setHoursLeft(0);
		}
		else {
			this.currentTask.setWorkingHours(0);
			this.setHoursLeft(0);
		}
		showReport();
		
	}
	void showReport(){
		System.out.println("Name of employee: " + this.name);
		System.out.println("Name of his task: " + this.currentTask.getName() );
		System.out.println("Employee working hours left: " + this.getHoursLeft());
		System.out.println("Work hours left to complete the task: " + this.currentTask.getWorkingHours());
	}

}
