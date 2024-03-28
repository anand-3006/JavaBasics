package Basic_Programs;
import java.util.*;
public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int revNumber = 0;
		while(a > 0) {
			int reminder = a % 10;
			revNumber = (revNumber * 10) + reminder;  
			a = a / 10;
		}
		System.out.println("the reverse number is : "+revNumber);
	}
}
