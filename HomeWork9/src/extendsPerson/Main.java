package extendsPerson;

public class Main {

	public static void main(String[] args) {
		Person person[] = new Person[10];
		person[0]=new Person("Pesho",33,true);
		person[1]=new Person("Pesho",33,true);
		person[2]=new Student("Pesho",33,true,4.5);
		person[3]=new Student("Pesho",33,true,6.0);
		person[4]=new Employee("Pesho",33,true,3240);
		person[5]=new Employee("Pesho",33,true,1250);
		
		for (int i = 0; i < person.length; i++) {
			if(person[i] != null){
				if (person[i] instanceof Student) {
					((Student) person[i]).showStudentInfo();
				}
				else if(person[i] instanceof Employee) {
					((Employee) person[i]).showEmployeeInfo();
				}
				else {
					person[i].showPersonInfo();
				}
			}
			
		}
		
		for (int i = 0; i < person.length; i++) {
			if(person[i] instanceof Employee) {
				System.out.println(((Employee) person[i]).calculateOvertime(2));
			}
		}

	}

}
