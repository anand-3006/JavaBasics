package Loops;
import java.util.*;
public class whileloopExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int A = sc.nextInt();
		System.out.println("Enter the value of i : ");
		int i = sc.nextInt();
		while(i < A) {
			System.out.println("Hello world "+i);
			i++;
		}
	}
}
