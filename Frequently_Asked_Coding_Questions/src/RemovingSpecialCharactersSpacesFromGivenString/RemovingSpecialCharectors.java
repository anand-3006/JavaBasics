package RemovingSpecialCharactersSpacesFromGivenString;

import java.util.Scanner;

public class RemovingSpecialCharectors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with special charactors");
		String str = sc.nextLine();
		String rs = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The String excluding specialCharacters is : ");
		System.out.println(rs);
	}
}
