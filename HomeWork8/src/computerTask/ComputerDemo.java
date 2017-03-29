package computerTask;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.freeMemory=2000;
		c1.hardDiscMemory=20000;
		c1.operationSystem="Windows 7";
		c1.price=500;
		c1.year=2001;
		c1.isNotebook=false;
		c1.useMemory(100);
		
		Computer c2=new Computer();
		c2.freeMemory=5000;
		c2.hardDiscMemory=200000;
		c2.operationSystem="Windows 7";
		c2.price=1500;
		c2.year=2013;
		c2.isNotebook=true;
		c2.changeOperationSystem("Windows 10");
		
		int sw=c1.comparePrice(c2);
		switch(sw) {
		case 1: System.out.println("The computer,passed as an argument to comparePrice - c2 is more expensive than the other (c1)");
		break;
		case -1: System.out.println("The computer,calling the method comparePrice - c1 is more expensive than the other (c2)");
		break;
		case 0: System.out.println("The computer,calling the method comparePrice -c1 is as expensive as is the computer, passed as an argument in the method comparePrice - c2");
		}
		
	//	System.out.println("Computer 1" + c1);
	//	System.out.println("Computer 2" + c2);

	}

}
