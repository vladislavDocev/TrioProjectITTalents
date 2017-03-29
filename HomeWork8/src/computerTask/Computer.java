package computerTask;

public class Computer {
	int year;
	int price;
	boolean isNotebook;
	int hardDiscMemory;
	int freeMemory;
	String operationSystem;
	
	Computer() {
		this.isNotebook=false;
		this.operationSystem="Win XP";
	}
	Computer(int year,int price,int hardDiscMemory,int freeMemory) {
		this();
		this.year=year;
		this.price=price;
		this.hardDiscMemory=hardDiscMemory;
		this.freeMemory=freeMemory;
	}
	Computer(int year,int price,boolean isNotebook,int hardDiscMemory,int freeMemory,String operationSystem) {
		this.year=year;
		this.price=price;
		this.isNotebook=isNotebook;
		this.hardDiscMemory=hardDiscMemory;
		this.freeMemory=freeMemory;
		this.operationSystem = operationSystem;
	}
	int comparePrice(Computer c) {
		if(this.price>c.price) {
			return -1;
		}
		else if(this.price<c.price) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	void changeOperationSystem(String newOperationSystem) {
		if(operationSystem!=newOperationSystem) {
			operationSystem=newOperationSystem;
		}
	}
	void useMemory(int memory) {
		if(memory>freeMemory) {
			System.out.println("Not enough free memory");
		}
		else {
			freeMemory-=memory;
		}
	}
	 @Override
	  public String toString() {
	    return "year: " + year + "\n price: " + price + "\n Is Notebook: " + isNotebook +
	    		"\n Hard Disc Memory: " + hardDiscMemory + "\n Free Memory: " + 
	    		freeMemory + "\n Operation System: " + operationSystem;
	  }
	

}
