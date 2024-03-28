package ReverseNumber;
import java.util.*;
public class UsingStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sb.reverse();
		System.out.println("Reversed number is : "+rev);
	}
}
