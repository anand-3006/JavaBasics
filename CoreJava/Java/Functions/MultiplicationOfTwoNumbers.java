package Functions;
import java.util.*;
public class MultiplicationOfTwoNumbers {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a : ");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of b : ");
//		int b = sc.nextInt();
//		int multiplication = CalculateMultiplication(a, b);
//		System.out.println("Multiplication of two numbers is : "+multiplication);
//	}
//	public static int CalculateMultiplication(int a, int b) {
//		int multiplication = a * b;
//		return multiplication;
//	}
//	OR
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.println("The Multiplication of Two numbers is : "+Calculate(a, b));
	}
	public static int Calculate(int a, int b) {
		return a * b;
	}
}
