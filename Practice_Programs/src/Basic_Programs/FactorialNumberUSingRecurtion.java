package Basic_Programs;
import java.util.*;
public class FactorialNumberUSingRecurtion {
	static int factorial(int a) {
		if(a <= 1) {
			return 1;
		}
		return a * factorial(a-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial number using recurtion ");
		int a = sc.nextInt();
		int result = factorial(a);
		System.out.println("The factorial number "+a+" is "+result);
	}
}
