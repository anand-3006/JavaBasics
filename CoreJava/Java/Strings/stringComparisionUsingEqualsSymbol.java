package Strings;
import java.util.*;
public class stringComparisionUsingEqualsSymbol {
	public static void main(String[] args) {
		//if we initialize the string like below then the == work
		String str1 = "Anand";
		String str2 = "Anand";
		//if we take strings from user side then == not work it will give else statement only
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the str1 : ");
//		String str1 = sc.nextLine();
//		System.out.println("Enter the str2 : ");
//		String str2 = sc.nextLine();
		if(str1 == str2) {
			System.out.println("The str1 and str2 are equal");
		}else {
			System.out.println("The str1 and str2 are not equal");
		}
	}
}
