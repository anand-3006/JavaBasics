package PatternProblems.NumberPatterns;
import java.util.*;
public class InvertNumberHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int v = sc.nextInt();
		System.out.println("The InvertedNumberHalfPyramid is");
		//Outer Loop
		for(int i = v; i >= 1; i--) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
