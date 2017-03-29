package homeWork6;

public class Task1 {

	public static void main(String[] args) {
		int n=fib(8);
		System.out.println(n);

	}
	static int fib(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
