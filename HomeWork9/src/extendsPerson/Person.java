package extendsPerson;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	int getAge() {
		return this.age;
	}
	
	Person(String name,int age,boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	void showPersonInfo(){
		if(this.isMale) {
		System.out.println("Person name is:" + this.name + 
				"\nAge:" + this.age + "\nGender:male");
		}
		else {
			System.out.println("Person name is:" + this.name + 
					"\nAge:" + this.age + "\nGender:female");
		}
		
	}

}
