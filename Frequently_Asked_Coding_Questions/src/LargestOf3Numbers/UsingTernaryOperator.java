package LargestOf3Numbers;
import java.util.*;
public class UsingTernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		//In the below line it will compare the values of a and b then it will return the true and false.
		//Then the value will be stored into variable
		int largest = a > b ? a : b;
		largest = largest > c ? largest : c;
		//Also we can right the above condition in one line.
		//int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);//this is known as combine statement.
		System.out.println("The largest number is "+largest);
	}
}
