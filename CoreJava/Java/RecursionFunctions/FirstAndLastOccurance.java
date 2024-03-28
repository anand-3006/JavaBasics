package RecursionFunctions;
//Time complexity of this program is O(n) in this n value is string length
import java.util.Scanner;

public class FirstAndLastOccurance {
	static int first = -1;
	static int last = -1;
	public static void Occurance(int idx, String str, char element) {
		//Base Condition
		if(idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char current = str.charAt(idx);
		if(current == element) {
			if(first == -1) {
				first = idx;
			}else {
				last = idx;
			}
		}
		Occurance(idx+1, str, element);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String : ");
		String str = sc.nextLine();
		System.out.println("Enter a char to find it's first and last occurance : ");
		char element = sc.next().charAt(0);
		Occurance(0, str, element);
	}
}
