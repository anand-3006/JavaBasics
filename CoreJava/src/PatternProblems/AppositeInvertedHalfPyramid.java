package PatternProblems;
import java.util.*;
public class AppositeInvertedHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		System.out.println("AppositeInvertedHalfPyramid");
		//Outer Loop
		for(int i = x; i>=0;i--) {
			//Inner Loop for spaces
			for(int j = 0; j<=x-i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
