package allWork;

public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Petko");
		Employee e2 = new Employee("Default");
		Employee e3 = new Employee("Killer");
		Employee e4 = new Employee("WorkKiller");
		
		Employee.allWork = new AllWork();
		
		Employee.allWork.addTask(new Task("Programming", 12 ));
		Employee.allWork.addTask(new Task("Playing the guitar", 8 ));
		Employee.allWork.addTask(new Task("Playing games", 10));
		Employee.allWork.addTask(new Task("Taking trips", 12 ));
		Employee.allWork.addTask(new Task("Working with foreigners", 8 ));
		Employee.allWork.addTask(new Task("Testing software", 15 ));
		Employee.allWork.addTask(new Task("Innovation Development",12 ));
		Employee.allWork.addTask(new Task("All you can eat", 5));
		Employee.allWork.addTask(new Task("Working on deadlines",12 ));
		Employee.allWork.addTask(new Task("HR interviews", 8 ));
		Employee.allWork.addTask(new Task("Selective teamwork", 8 ));
		Employee.allWork.addTask(new Task("Cleaning", 8));
		
		int workAssignmentNumber=1;
		int dayNumber=1;
		while(true){
			e1.startWorkingDay();
			e2.startWorkingDay();
			e3.startWorkingDay();
			e4.startWorkingDay();
			System.out.println("   Day " + dayNumber++);
			System.out.println("   Work Assignment Number " +workAssignmentNumber++ );
			e1.work();
			if(Employee.allWork.isAllWorkDone()){
				break;
			}
			System.out.println("   Work Assignment Number " +workAssignmentNumber++ );
			e2.work();
			if(Employee.allWork.isAllWorkDone()){
				break;
			}
			System.out.println("   Work Assignment Number " +workAssignmentNumber++ );
			e3.work();
			if(Employee.allWork.isAllWorkDone()){
				break;
			}
			System.out.println("   Work Assignment Number " +workAssignmentNumber++ );
			e4.work();
			if(Employee.allWork.isAllWorkDone()){
				break;
			}
		} 
	}

}
