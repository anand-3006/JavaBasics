package HomeWorkExamples;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers A and B values to calculate those numbers : ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("Enter a number : ");
		int N = sc.nextInt();
		switch(N) {
		case 1:
			System.out.println("The Sum of two numbers is : ");
			System.out.println(A+B);
			break;
		case 2:
			System.out.println("The Substraction of Two numbers is :");
			System.out.println(A-B);
			break;
		case 3:
			System.out.println("The Multiplication of two numbers is : ");
			System.out.println(A*B);
			break;
		case 4:
			if(A == 0) {
				System.out.println("The value of A is Not Equals to 0");
			}else if(A<B) {
				System.out.println("Please enter A value Bigger than B");
			}else {
				System.out.println("The Division of Two numbers is : ");
			System.out.println(A/B);
			}
			break;
		case 5:
			System.out.println("The modulo of two numbers is : ");
			System.out.println(A%B);
		}
	}
}
