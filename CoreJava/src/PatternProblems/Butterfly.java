package PatternProblems;
import java.util.*;
public class Butterfly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to print Butterfly Pattern : ");
		int n = sc.nextInt();
		System.out.println("The Butterfly Patter is for yoyr given value is : ");
		//for upper half
		for(int i = 1; i <= n; i++) {
			
			//for first half * stars
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			//for spaces
			int a = 2*(n - i);
			for(int j = 1; j <= a; j++) {
				System.out.print("  ");
			}
			
			//for second half * stars
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			
			//for first half * stars
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			//for spaces
			int a = 2*(n - i);
			for(int j = 1; j <= a; j++) {
				System.out.print("  ");
			}
			
			//for second half * stars
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
