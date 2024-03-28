package Loops;
import java.util.*;
public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int A = sc.nextInt();
		System.out.println("Enter the value of i : ");
		int i = sc.nextInt();
		do {
			System.out.println("Hello world "+i);
			i++;
		}while(i < A);
	}
}
