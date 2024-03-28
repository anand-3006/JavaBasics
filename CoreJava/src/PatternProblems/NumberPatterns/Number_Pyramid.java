package PatternProblems.NumberPatterns;
import java.util.*;
public class Number_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("The Number Pyramid is");
		for(int i = 1; i <= a; i++) {
			//for spaces
			for(int j = 1; j <= a-i; j++) {
				System.out.print(" ");
			}
			//for numbers
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
