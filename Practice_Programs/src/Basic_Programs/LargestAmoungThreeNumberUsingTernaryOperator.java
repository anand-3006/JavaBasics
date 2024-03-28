package Basic_Programs;
import java.util.*;
public class LargestAmoungThreeNumberUsingTernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c ");
		int c = sc.nextInt();
		int largest;
		largest = (a > b && a > c) ? a : ((b > c && b > a) ? b : c);
		System.out.println("The largest among three numbers is "+largest);
	}
}