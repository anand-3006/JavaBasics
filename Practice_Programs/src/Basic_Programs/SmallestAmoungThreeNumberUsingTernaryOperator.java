package Basic_Programs;
import java.util.*;
public class SmallestAmoungThreeNumberUsingTernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c ");
		int c = sc.nextInt();
		int smallest;
		smallest = (a < b && a < c) ? a : ((b < c && b < a) ? b : c);
		System.out.println("The smallest among three numbers is "+smallest);
	}
}
