package ReverseNumber;
import java.util.*;
public class UsingStringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		//In the above line it will convert the int into string and after that we are using inbuilt method 
		StringBuffer rev = sb.reverse();
		System.out.println("The reversed number is : "+rev);
	}
}
