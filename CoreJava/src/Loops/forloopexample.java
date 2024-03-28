package Loops;
import java.util.*;
public class forloopexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("The output : ");
		for(int i = 1; i <= a; i++) {
			System.out.println("Hello world"+" "+i);
		}
	}
}
