package RecursionFunctions;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		Reverse(str.length()-1, str);
	}
	public static void Reverse(int i, String str) {
		//Base Condition
		if(i == 0) {
			System.out.println(str.charAt(i));
			return;
		}
		//Recursion Condition
		System.out.print(str.charAt(i));
		Reverse(i-1, str);
	}
}
