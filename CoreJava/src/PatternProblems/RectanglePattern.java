package PatternProblems;
import java.util.*;
public class RectanglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for m");
		int m = sc.nextInt();
		System.out.println("Enter a number for n");
		int n = sc.nextInt();
		for(int i = 0; i<=m; i++) {
			for(int j = 0; j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
