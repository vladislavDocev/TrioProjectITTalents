package homeWork6;

public class Task3 {

	public static void main(String[] args) {
		int n=101;
		boolean isPrime=Prime(n,2);
		if(isPrime){
		System.out.println(n + " is Prime");
		}
		else {
			System.out.println(n + " is not Prime");
		}

	}
	
	static boolean Prime(int n,int delitel) {
		if(n==delitel) {
			return true;
		}
		if(n%delitel==0) {
			return false;
		}
		return Prime(n,delitel+1);
	}

}
