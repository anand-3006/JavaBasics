package PatternProblems;
import java.util.*;
public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("The diamond Pattern is : ");
		//Upper part
		for(int i = 1; i <= a; i++) {
			//for spaces
			for(int j = 1; j <= a-i; j++) {
				System.out.print("  ");
			}
			//for star's
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//Lower part
		for(int i = a-1; i >= 1; i--) {
			//for spaces
			for(int j = 1; j <= a-i; j++) {
				System.out.print("  ");
			}
			//for star's
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
