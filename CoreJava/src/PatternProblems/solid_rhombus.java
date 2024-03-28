package PatternProblems;
import java.util.*;
public class solid_rhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("This is Solid Rhombus Pattern");
		for(int i = 1; i <= a; i++) {
			//for spaces
			int b = a-i;
			for(int j = 1; j <= b; j++) {
				System.out.print("  ");
			}
			//for * stars
			for(int j = 1; j <= a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
