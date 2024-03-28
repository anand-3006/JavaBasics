package PatternProblems.NumberPatterns;
import java.util.*;
public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int A = sc.nextInt();
		System.out.println("The Floyds Triangle is : ");
		int B = 1;
		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(B+" ");
				B++;
			}
			System.out.println();
		}
	}
}
