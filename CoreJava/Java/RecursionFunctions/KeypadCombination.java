package RecursionFunctions;

import java.util.Scanner;

public class KeypadCombination {
	static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Keypad(str, 0, "");
	}

	private static void Keypad(String str, int idx, String combination) {
		// TODO Auto-generated method stub
		
		//Base Condition
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		char currentChar = str.charAt(idx);
		String mapping = keypad[currentChar - '0'];
		
		for(int i = 0; i < mapping.length(); i++) {
			Keypad(str, idx+1, combination+mapping.charAt(i));
		}
	}
}
