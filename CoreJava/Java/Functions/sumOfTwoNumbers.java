package Functions;
import java.util.*;
public class sumOfTwoNumbers {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a : ");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of b : ");
//		int b = sc.nextInt();
//		sumOfTwoNumbers(a, b);
//		
//	}
//	public static int sumOfTwoNumbers(int a, int b) {
//		int c = a + b;
//		System.out.println("The sum of two numbers is : "+c);
//		return c;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		int sum = calculateSum(a, b);
		System.out.println("The sum of two numbers is : "+sum);
	}
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
