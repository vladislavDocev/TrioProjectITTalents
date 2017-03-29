package homeWork6;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		int n=10;
		int[] array = nArrayPrint(n);
		System.out.println(Arrays.toString(array));
	}
	static int[] nArrayPrint(int n) {
		int [] array = new int[n];
		for (int i = n-1; i >= 0; i--) {
			array[i]=n;
			n--;
		}
		return array;
	}
}
