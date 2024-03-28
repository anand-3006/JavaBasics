package RecursionFunctions;
//Time Complexity of this program is O(2^n)
import java.util.Scanner;

public class SubSequenceOfaString {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		System.out.println("The possible subsequences are : ");
		SubSequence(str, 0, "");
		//System.out.println("The total possible subsequences are : "+count);
	}

	private static void SubSequence(String str, int i, String string) {
		// TODO Auto-generated method stub
		//Base Condition
		if(str.length()==i) {
			System.out.println(string);
			return;
		}
		
		char currentChar = str.charAt(i);
		//To Be
		SubSequence(str, i+1, string+currentChar);
		//Not Be
		SubSequence(str, i+1, string);
	}
}