package Strings;
import java.util.*;
public class PrintingCharectarSeperatlyFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		//count the characters from a given string
		System.out.println("The string length is : "+str.length());
		//to print characters in different line
		System.out.println("The characters from a string is : ");
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
