package project.Users;
// Използвам този клас като модел за създаване на обекти от тип UserDetails. 
public class UserDetails {

	private String faculty; 
	private String university; // Свойства на user
	private int facNumber;

	public int getfacNumber() {
		return facNumber;
	}

	public void setfacNumber(int facNumber) {
		this.facNumber = facNumber;
	}

	public String getName() {
		return faculty;
	}

	public void setName(String name) {
		this.faculty = name;
	}

	public String getuniversity() {
		return university;
	}

	public void setuniversity(String university) {
		this.university = university;
	}

	public UserDetails(String faculty, String university, int facNumber) {
		this.faculty = faculty;
		this.university = university; 
		this.facNumber = facNumber;
	}

	public String toString() {
		return "\n" + faculty + " " + university + " " + facNumber;
	}

}
