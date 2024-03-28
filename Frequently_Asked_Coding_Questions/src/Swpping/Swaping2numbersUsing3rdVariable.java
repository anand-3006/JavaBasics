package Swpping;
import java.util.*;
public class Swaping2numbersUsing3rdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The Entered numbers are a : "+a+" b : "+b);
		//swapping numbers
		int temp = a;
			  a = b;
			  b = temp;
			  System.out.println("The swapped numbers are a : "+a+" b : "+b);
	}
}
