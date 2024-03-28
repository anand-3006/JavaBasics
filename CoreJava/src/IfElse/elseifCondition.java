package IfElse;
import java.util.*;
public class elseifCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A = sc.nextInt();
		System.out.println("Enter the value of B");
		int B = sc.nextInt();
		
		if(A == B) {
			System.out.println("The Values of A and B are Equal");
		}else if( A > B) {
			System.out.println("The value of A is Greater than B");
		}else {
			System.out.println("The value of A is Less than B");
		}
	}
}
