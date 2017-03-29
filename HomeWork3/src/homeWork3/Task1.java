package homeWork3;

public class Task1 {

	public static void main(String[] args) {
		
		int array[] = { 2,4,5,6,-3,7,8,9,12 };
		int smallest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(smallest > array[i] && array[i]%3==0) {
				smallest=array[i];
			}
		}
		System.out.println(smallest);
	}

}
