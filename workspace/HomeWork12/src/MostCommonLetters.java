import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostCommonLetters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int letters = 0 ;
		TreeMap<Character, Integer> treeMap = new TreeMap();
		System.out.println("Enter text:");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		str = str.toUpperCase();
		sb.append(str);
		str = null;
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if(ch > 64 && ch<91) {
				letters++;
				if(treeMap.containsKey(ch)) {
					int value = treeMap.get(ch);
					value++;
					treeMap.put(ch,value);
				}
				else {
					treeMap.put(ch, 1);
				}
			}
		}
		System.out.println(treeMap);
		for(Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
			System.out.print(entry + " ");
			for (int i = 0; i < (entry.getValue()*(100/letters)); i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
	

}
