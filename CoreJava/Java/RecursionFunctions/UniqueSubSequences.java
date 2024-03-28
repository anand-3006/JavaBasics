package RecursionFunctions;
//The time complexity of this program is O(2^n)
import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubSequences {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println("The possible unique sub strings are : ");
		UniqueSub(str, 0, "", set);
	}

	private static void UniqueSub(String str, int i, String string, HashSet<String> set) {
		// TODO Auto-generated method stub
		
		//Base Case
		if(str.length() == i) {
			if(set.contains(string)) {
				return;
			}else {
				System.out.println(string);
				set.add(string);
				return;
			}
		}
		
		char currentChar = str.charAt(i);
		//To Be
		UniqueSub(str, i+1, string+currentChar, set);
		
		//Not Be
		UniqueSub(str, i+1, string, set);
	}
}
