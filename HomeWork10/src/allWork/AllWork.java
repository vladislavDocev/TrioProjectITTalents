package allWork;

public class AllWork {
	Task tasks[];
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork() {
		this.tasks=new Task[12];
		this.freePlacesForTasks=tasks.length-1;
		this.currentUnassignedTask=0;
	}
	void addTask(Task task) {
		this.tasks[this.freePlacesForTasks--]=task;
	}
	Task getCurrentTask() {
		return tasks[currentUnassignedTask];
	}
	Task getNextTask(){
		return tasks[currentUnassignedTask++];
	}
	boolean isAllWorkDone(){
		boolean workDone=true;
		for (int i = 0; i < Employee.allWork.tasks.length; i++) {
			if(Employee.allWork.tasks[i].getWorkingHours()>0) {
				workDone=false;
			}
		}
		return workDone;
	}
	
	
}
