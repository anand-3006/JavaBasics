package PatternProblems.NumberPatterns;
import java.util.*;
public class Number_Palindromic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int s = sc.nextInt();
		System.out.println("The Number Palindrom Pattern");
		//for pattern
		for(int i = 1; i <= s; i++) {
			//for spaces
			for(int j = 1; j <= s-i; j++) {
				System.out.print("  ");
			}
			//for first half
			for(int j = i; j>=1 ; j--) {
				System.out.print(" "+j);
			}
			//for second half
			for(int j = 2; j <= i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
