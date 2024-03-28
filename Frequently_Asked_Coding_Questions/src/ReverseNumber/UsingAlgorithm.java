package ReverseNumber;
import java.util.*;
public class UsingAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rev = 0;
		while(num > 0) {
			rev = rev * 10 + num % 10; //Here it will store the last value present in the num
			num = num / 10;//It will remove the last digit or stored digit in rev variable
		}
		System.out.println("Reversed number is : "+rev);
	}
}
