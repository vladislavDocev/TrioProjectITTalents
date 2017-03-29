package homeWork6;

public class RecursiveAvg {

	public static void main(String[] args) {
		int array[] = { -15,-20,0,5,10,26 };
		boolean positive = positive(array,0,0);
		System.out.println(positive);
		

	}
	static boolean positive(int array[],int avg,int fromIndex) {
		if(fromIndex==array.length-1) {
			avg = (avg+array[fromIndex])/array.length;
			System.out.println(avg);
			if(avg>0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			avg=avg+array[fromIndex];
			return positive(array,avg,fromIndex+1);
		}
	}
}
