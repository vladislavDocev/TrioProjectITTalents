package homeWork3;

public class Task2 {

	public static void main(String[] args) {
		
		int[] array1 = { 2,3,4,5,6,7 };
		int[] array2 = new int[array1.length*2];
		int elem=1;
		
		for (int i = 0; i < array2.length/2; i++) {
			array2[i]=array1[i];
		}
		for (int i = array2.length/2; i < array2.length; i++) {
			array2[i]=array1[i-elem];
			elem+=2;
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+ " ");
		}
	}

}
