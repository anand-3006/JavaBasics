package RemovingSpecialCharactersSpacesFromGivenString;

import java.util.Scanner;

public class RemovingSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//in the below line \\s is detect the white spaces
		str = str.replaceAll("\\s", "");
		System.out.println("The string after replacing the spaces is : "+str);
	}
}
