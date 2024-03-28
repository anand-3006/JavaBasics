package Loops;
import java.util.*;
public class Examplesumofgivennumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum = sum+i;
			System.out.println("The sum of given number is : "+sum);
		}
		System.out.println();
		System.out.println("The Total sum of given number is : "+sum);
	}
}
