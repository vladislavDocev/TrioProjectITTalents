package homeWork6;

public class Task5 {

	public static void main(String[] args) {
		int n = 12321;

		boolean isPalindrom = isPalindrom(n, 0, n);
		System.out.println(isPalindrom);
	}

	static boolean isPalindrom(int n, int help, int copy) {
		boolean isPalindrom = (copy == help);
		if (n == 0) {
			return isPalindrom;
		}

		help = help * 10 + n % 10;
		return isPalindrom(n / 10, help, copy);

	}

}
