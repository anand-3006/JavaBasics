package PatternProblems.NumberPatterns;
import java.util.*;
public class ZeroOneTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("The ZeroOne Triangle is : ");
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				int s = i + j;
				if(s%2 == 0) {
					System.out.print(" 1 ");
				}else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}
}
