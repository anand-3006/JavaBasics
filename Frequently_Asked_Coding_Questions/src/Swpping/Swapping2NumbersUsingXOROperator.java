package Swpping;
import java.util.*;
//Without using 3rd variable
public class Swapping2NumbersUsingXOROperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The given numbers are a : "+a+" b : "+b);
		//logic using XOR Operator
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("The numbers after swapping are a : "+a+" b : "+b);
	}
}
