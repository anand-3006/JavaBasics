package Basic_Programs;
import java.util.*;
public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("The addition of two numbers is : "+c);
		
		System.out.printf("Addition : "+"%d + %d = %d",a,b,c);
	}
}
