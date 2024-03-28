package PatternProblems;
import java.util.*;
public class HalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
