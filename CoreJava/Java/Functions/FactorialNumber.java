package Functions;
import java.util.*;
public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		FactorialNumbers(a);
	}
	public static void FactorialNumbers(int a) {
		//loop
		if(a < 0) {
			System.out.println("Inavalid Input!!");
			return;
		}
		int factorial = 1;
		for(int i = a; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;
	}
}
