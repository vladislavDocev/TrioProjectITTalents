package homeWork3;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  array[] = new double[10];
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("Enter element [" + j + "]" );
			array[j]=sc.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]<-0.231) {
				array[i]=(i+1)*(i+1)+41.25;
			}
			else {
				array[i]=(i+1)*array[i];
			}
			System.out.print(array[i]+" ");
		} 
			
		
	}

}
//  -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
// 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25