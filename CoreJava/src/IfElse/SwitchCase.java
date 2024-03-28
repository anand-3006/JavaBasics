package IfElse;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value from 1 to 3");
		int A = sc.nextInt();
		switch(A) {
		case 1:
			System.out.println("Hello");
			break;
		case 2: 
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("Invalide Entry!!");
		}
	}
}
