package Basic_Programs;
import java.util.*;
public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println("Can't find factorial of negative number!!");
		}else if(a <= 1) {
			System.out.println("The enterd number "+a+" is : 1");
		}else {
			int factorial = 1;
			for(int i = a; i >= 2; i--) {
				factorial = factorial * i;
			}
			System.out.println("The factorial of "+a+" number is : "+factorial);
		}
	}
}
