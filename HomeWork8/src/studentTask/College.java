package studentTask;

public class College {

	public static void main(String[] args) {
		Student s1 = new Student("Petko","Mathematics",22);
		Student s2 = new Student("Default","Mathematics",21);
		StudentGroup sg = new StudentGroup("Mathematics");
		s1.setGrade(6.00);
		s2.setGrade(5.99);
		sg.addStudent(s1);
		sg.addStudent(s2);
		System.out.println(sg.theBestStudent());
		System.out.println(sg.getStudents());

	}

}
