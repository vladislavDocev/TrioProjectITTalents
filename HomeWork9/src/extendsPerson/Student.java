package extendsPerson;

public class Student extends Person {
	private double score;
	
	Student() { // Може да има конструктор без параметри, ако инициализираме супер конструктора и 
		       //   score с default стойности в тялото на конструктора
		super("null",22,false);
		this.score=6.00;
	}
	
		Student(String name,int age,boolean isMale,double score) {
			super(name,age,isMale);
			this.score=score;
		}
		
		void showStudentInfo(){
			super.showPersonInfo();
			System.out.println("Score:"+ this.score);
		}
}


