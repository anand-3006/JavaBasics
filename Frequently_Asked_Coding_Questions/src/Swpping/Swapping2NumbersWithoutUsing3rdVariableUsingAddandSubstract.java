package Swpping;
import java.util.*;
public class Swapping2NumbersWithoutUsing3rdVariableUsingAddandSubstract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The given numbers are a : "+a+" b : "+b);
		//Swapping two numbers Without using third variable
		//Example a = 10 and b = 20
		a = a + b; // a = 10 + 20 = 30 here a value is got changed to 30
		b = a - b; // b = 30 - 20 = 10 here b value is got changed to 10
		a = a - b; // a = 30 - 10 = 20 here a value is got changed to 20 so now values are a = 20 and b = 10;
		System.out.println("The numbers after swapping are a : "+a+" b : "+b);
	}
}
