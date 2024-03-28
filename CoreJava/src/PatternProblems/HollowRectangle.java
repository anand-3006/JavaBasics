package PatternProblems;
import java.util.*;
public class HollowRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = sc.nextInt();
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Output!!");
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				if(i==0 || j==0 || i==m || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
