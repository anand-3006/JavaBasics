package Swpping;
import java.util.Scanner;
//Without using 3rd variable
public class Swapping2NumbersUsingsingleStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The given numbers are a : "+a+" b : "+b);
		//logic using Single Statement
		b = a + b - (a = b);
		System.out.println("The numbers after swapping are a : "+a+" b : "+b);
	}
}
