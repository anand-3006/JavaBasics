package ReverseString;
import java.util.*;
public class UsingStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuilder strb = new StringBuilder(str);
		System.out.println("The reversed string is : "+strb.reverse());
	}
}
