package PatternProblems;
import java.util.*;
public class InvertedHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println("Please Enter Possitive Number!!");
		}else {
		System.out.println("The Inverted Half Pyramid is : ");
		for(int i = a; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	  }
	}
		
}
