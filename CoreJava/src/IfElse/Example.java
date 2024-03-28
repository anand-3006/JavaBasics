package IfElse;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 3");
		int A = sc.nextInt();
		if(A == 1) {
			System.out.println("Hello");
		}else if(A == 2) {
			System.out.println("Namaste");
		}else if(A == 3) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid Entry!!");
		}
	}
}
