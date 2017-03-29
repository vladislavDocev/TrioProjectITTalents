package allWork;


import java.util.Scanner;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	static AllWork allWork;

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
			System.out.println(this.allWork.getCurrentTask().getWorkingHours());
			System.out.println("Wrong hours! Enter positive hour: ");
			Scanner sc = new Scanner(System.in);
			hoursLeft=sc.nextInt();
		}
		this.hoursLeft = hoursLeft;
		
		
	}
	void work() {
		if((this.currentTask.getName().equals(null)) || (this.currentTask.getName().isEmpty() || this.getCurrentTask().getWorkingHours()==0 ) ) {
			System.out.println("Your employee has no task and will get the next available one ");
			this.setCurrentTask(Employee.allWork.getNextTask());
			System.out.println("It will take " + Employee.allWork.getCurrentTask().getWorkingHours() + " hours for the job to be complete ");
			System.out.println("Your employee has " + this.getHoursLeft() + " working hours left for the day");
		}
		if(this.getHoursLeft()>Employee.allWork.getCurrentTask().getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft()-Employee.allWork.getCurrentTask().getWorkingHours());
			Employee.allWork.getCurrentTask().setWorkingHours(0);
			this.getCurrentTask().setWorkingHours(0);
			
		}
		if(Employee.allWork.getCurrentTask().getWorkingHours()>this.getHoursLeft()) {
			Employee.allWork.getCurrentTask().setWorkingHours(Employee.allWork.getCurrentTask().getWorkingHours()-this.getHoursLeft());
			this.getCurrentTask().setWorkingHours(this.currentTask.getWorkingHours()-this.getHoursLeft());
			this.setHoursLeft(0);
		}
		else {
			Employee.allWork.getCurrentTask().setWorkingHours(0);
			this.getCurrentTask().setWorkingHours(0);
			this.setHoursLeft(0);
		}
		if(this.getHoursLeft()>0){
			this.work();
		}
		showReport();
		
	}
	void startWorkingDay() {
		this.setHoursLeft(8);
	}
	void showReport(){
		System.out.println("Name of employee: " + this.name);
		System.out.println("Name of his task: " + this.currentTask.getName() );
		System.out.println("Employee working hours left: " + this.getHoursLeft());
		System.out.println("Work hours left to complete the task: " + Employee.allWork.getCurrentTask().getWorkingHours());
	}

}
