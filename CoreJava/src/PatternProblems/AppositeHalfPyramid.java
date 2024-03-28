package PatternProblems;
import java.util.*;
public class AppositeHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		System.out.println("AppositeHalfPyramid!!");
		//Outer Loop
		for(int i = 1; i <= a; i++) {
			//Inner loop for spaces
			for(int j = 1; j <= a-i; j++) {
				System.out.print("  ");
			}
			//Inner Loop for * Star
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
