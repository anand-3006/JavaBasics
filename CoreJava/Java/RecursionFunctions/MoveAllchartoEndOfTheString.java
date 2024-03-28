package RecursionFunctions;

import java.util.Scanner;

public class MoveAllchartoEndOfTheString {
	public static void Movechar(String str, int idx, int count, String newStr, char c) {
		if(idx == str.length()) {
			for(int i = 0; i < count; i++) {
				newStr += c;
			}
			System.out.println(newStr);
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar == c) {
			count++;
			Movechar(str, idx+1, count, newStr, c);
		}else {
			newStr += currentChar; 
			Movechar(str, idx+1, count, newStr, c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		System.out.println("Enter a char to move to end : ");
		char c = sc.next().charAt(0);
		Movechar(str, 0, 0, "", c);
	}
}
