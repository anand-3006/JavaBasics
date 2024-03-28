package Basic_Programs;
import java.util.*;
import java.math.BigInteger;
public class FactorialNumberForBigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		BigInteger factorial = BigInteger.ONE;
		for(int i = a; i >= 2; i--) {
			factorial = factorial.multiply(factorial.valueOf(i));
		}
		System.out.println(factorial);
	}
}
