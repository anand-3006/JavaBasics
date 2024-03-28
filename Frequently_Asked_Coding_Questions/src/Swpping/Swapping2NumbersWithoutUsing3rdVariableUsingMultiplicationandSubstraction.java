package Swpping;
import java.util.*;
//In this logic the values of a and b are should not be zero then only it will work
//Any one of the value is zero then it will through the arithmetic exception
public class Swapping2NumbersWithoutUsing3rdVariableUsingMultiplicationandSubstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The given numbers are a : "+a+" b : "+b);
		//logic
		//Example a = 10 and b = 20
		a = a * b; // a = 10 * 20 = 200 here the a value is got changed to a = 200 
		b = a / b; // b = 200 / 20 = 10 here the b value is got changed to b = 10
		a = a / b; // a = 200 / 10 = 20 here the a value is got changed to a = 20 and b = 10
		System.out.println("The numbers after swapping are a : "+a+" b : "+b);
	}
}
