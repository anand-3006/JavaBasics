package RecursionFunctions;

import java.util.Scanner;

public class FibbonaciNumber {
	public static void fibbonacciNumber(int a, int b, int n) {
		if(n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		fibbonacciNumber(b, c, n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		fibbonacciNumber(a, b, n-2);
	}
}
