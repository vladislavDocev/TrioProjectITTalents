
public class Kazan {
	
	private PLODOVE typeRakia;
	private static final int MAX_AMOUNT_KG = 10 ;
	private int currentAmount=0;
	
	
	public synchronized void addPlodove() {
		while(currentAmount>=MAX_AMOUNT_KG) {
			try {
				this.notifyAll();
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Ops "  + e.getMessage()) ;
			}
		}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println("Ops "  + e.getMessage()) ;
				}	
				currentAmount++;
	}
	public synchronized void variRakia() {
		while(currentAmount<MAX_AMOUNT_KG) {
			try {
				this.notifyAll();
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Ops "  + e.getMessage()) ;
			}
		}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Ops "  + e.getMessage()) ;
				}	
				currentAmount=0;
	}
	public PLODOVE getTypeRakia() {
		return this.typeRakia;
	}
	public void setTypeRakia(PLODOVE typeRakia) {
		this.typeRakia = typeRakia;
	}
	
	
	

}
