package ReverseString;
import java.util.*;
public class UsingCharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String rev = "";
		char[] ca = str.toCharArray();
		int length = ca.length;
		for(int i = length-1; i >= 0; i--) {
			rev = rev + ca[i];
		}
		System.out.println("Reversed String is : "+rev);
	}
}
