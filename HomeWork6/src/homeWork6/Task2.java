package homeWork6;

public class Task2 {

	public static void main(String[] args) {
		int x=5;
		int y=6;
		int z=Multiply(x,y);
		System.out.println(z);
	}
	
	static int Multiply(int x,int y) {
		if(y==1) {
			return x;
		}
		return x+Multiply(x,y-1);
	}

}
