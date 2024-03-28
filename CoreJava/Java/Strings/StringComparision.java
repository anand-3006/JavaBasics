package Strings;
import java.util.*;
public class StringComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second String : ");
		String str2 = sc.nextLine();
		//Comparing both Strings
		//case 1 if str1 is equals to str2
		if(str1.compareTo(str2) == 0) {
			System.out.println("The strings are equal");
		}else if(str1.compareTo(str2) == 1){
			System.out.println("The given str1 is less than str2");
		}else if(str1.compareTo(str2) == -1) {
			System.out.println("The given str1 is grater than str2");
		}else {
			System.out.println("The strings are not equal");
		}
	}
}
