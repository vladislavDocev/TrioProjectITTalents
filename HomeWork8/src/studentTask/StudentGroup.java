package studentTask;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGroup {
	private String groupSubject;
	private ArrayList<Student> students;
	private int freeSpaces;
	
	public ArrayList getStudents() {
		return this.students;
	}
	StudentGroup() {
		this.students = new ArrayList<Student>();
		this.freeSpaces = 5;
	}
	StudentGroup(String subject) {
		this();
		while(subject.equals(null) || subject.isEmpty()) {
			System.out.println("Incorrect subject, enter again");
			Scanner sc = new Scanner(System.in);
			subject=sc.nextLine();
		}
		this.groupSubject=subject;
		
	}
	void addStudent(Student s) {
		if(this.freeSpaces >0 && (s.getSubject()).equals(this.groupSubject)) {
			this.students.add(s);
			this.freeSpaces--;
		}
	}
	void emptyGroup(){
		this.students = new ArrayList<Student>();
		this.freeSpaces=5;
	}
	String theBestStudent() {
		double tempGrade=students.get(0).getGrade();
		String tempName = students.get(0).getName();
		
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getGrade()>tempGrade ) {
				tempGrade=students.get(i).getGrade();
				tempName=students.get(i).getName();
			}
		}
		return tempName;
	}
	

}
