package PatternProblems.NumberPatterns;
import java.util.*;
public class NumberHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		System.out.println("NumberHalfPyramid Is");
		//Outer Loop
		for(int i = 1; i <= a; i++) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
