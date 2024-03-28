package Basic_Programs;
import java.util.*;
public class SwapTwoNumbersUsingTheirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter vvalue of b : ");
		int b = sc.nextInt();
		int temp;
		//swapping two numbers using third variable
		temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
	}
}
