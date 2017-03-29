package homeWork6;

public class Task4 {

	public static void main(String[] args) {
		int begin = 1;
		int end = 9;
		int n = 1;
		Triangle(begin, end, n);

	}

	static void Triangle(int begin, int end, int n) {
		if (n == end) {
			PrintFromTo(begin, end);
		}
		if (n <= end) {
			PrintFromTo(begin, n);
			System.out.println();
			Triangle(begin, end, n + 1);
		}
	}

	static void PrintFromTo(int fromNumber, int toNumber) {
		if (toNumber == 1) {
			System.out.print(fromNumber + " ");
			return;
		}
		System.out.print(fromNumber++ + " ");
		PrintFromTo(fromNumber, toNumber - 1);
	}

}
