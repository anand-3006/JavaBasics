package ReverseString;
import java.util.*;
public class UsingStringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		StringBuffer strb = new StringBuffer(str);
		System.out.println("Reversed String is : "+strb.reverse());
	}
}
	