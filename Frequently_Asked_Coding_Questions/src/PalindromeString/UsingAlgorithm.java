package PalindromeString;
import java.util.*;
public class UsingAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String og = str;
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(og.equals(rev)) {
			System.out.println("The entered string is palindrome");
		}
		else {
			System.out.println("The entered string is not palindrome");
		}
	}
}
