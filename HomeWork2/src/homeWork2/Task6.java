package homeWork2;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number n, sum=1+2+3...+n");
		int n = sc.nextInt();
		int sum = 0;
		if (n < 1) {
			for(int i=1;i>=n;i--) {
			    sum+=i;
			}
			System.out.println(sum);
			
		}
		else {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println(sum);

		}

	}

}
