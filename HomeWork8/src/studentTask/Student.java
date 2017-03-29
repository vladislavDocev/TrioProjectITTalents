package studentTask;

import java.util.Scanner;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	
	public String getName() {
		return name;
	}
	public void setGrade(double grade) {
		if(grade>=2 && grade<=6) {
			this.grade=grade;
		}
	}
	public double getGrade() {
		return grade;
	}
	public String getSubject() {
		return subject;
	}

	
	Student() {
		this.grade=4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money=0;
	}
	Student(String name,String subject,int age) {
		this();
		while(name.equals(null) || name.isEmpty() || subject.equals(null) || subject.isEmpty() 
				|| age<=0) { 
		System.out.println("Incorrect Data, enter again");
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		name=sc.nextLine();
		System.out.println("subject: ");
		subject=sc.nextLine();
		System.out.println("age: ");
		age=sc.nextInt();
		}
		this.name=name;
		this.subject=subject;
		this.age=age;
	}
	void upYear() {
		if(this.yearInCollege<4) {
			this.yearInCollege++;
		}
		if(this.yearInCollege==4) {
			System.out.println("The student is last year.");
			this.isDegree = true;
		}
	}
	double receiveScholarship(double min,double amount) {
		if(this.grade >= min && this.age<30) {
			return this.money+=amount;
		}
		else {
			System.out.println("The student does not qualify for scholarship");
			return this.money;
		}
	}
	@Override
	public String toString() {
		return "\nName: " + this.getName() + " Grade: " + this.getGrade();
	}
	
	

}
