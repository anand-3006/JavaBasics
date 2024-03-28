package Strings;
import java.util.*;
public class StringConcatination {
	//adding two string and making one
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first sentence : ");
		String str1 = sc.nextLine();
		System.out.println("The first str is : "+str1);
		System.out.println("Enter the second sentance : ");
		String str2 = sc.nextLine();
		System.out.println("The second str is : "+str2);
		System.out.println("The full sentece is : ");
		System.out.println(str1+","+str2);
	}
}
