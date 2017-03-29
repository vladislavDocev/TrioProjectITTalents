package allWork;


public class Task {
	private String name;
	private int workingHours;
	
	Task(String name,int workingHour) {
		this.name=name;
		this.workingHours=workingHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
}
