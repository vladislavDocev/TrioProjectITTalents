package homeWork7;

public class Computer {
	int year;
	int price;
	boolean isNotebook;
	int hardDiscMemory;
	int freeMemory;
	String operationSystem;
	
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
