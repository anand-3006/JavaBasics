package Strings;
import java.util.*;
public class SubString {
	public static void main(String[] args) {
		//using this program we can fetch the required string or word
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter the begining index : ");
		int a = sc.nextInt();
		System.out.println("Enter the ending index : ");
		int b = sc.nextInt();
		String subString = str.substring(a, b);
		System.out.println("The substring is : "+subString);
	}
}
