package PatternProblems.NumberPatterns;
import java.util.*;
public class AppositeNumberHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = sc.nextInt();
		System.out.println("The AppositeNumberHalfPyramid is");
		//Outer Loop
		for(int i = 1; i <= s; i++) {
			//Inner Loop for spaces
			for(int j = 1; j <= s-i; j++) {
				System.out.print("  ");
			}
			//Inner Loop for * Stars
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
