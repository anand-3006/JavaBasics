package RecursionFunctions;

import java.util.Scanner;

public class Printing5to1numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("The numbers are : ");
		printNumber(n);
	}
	public static void printNumber(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNumber(n-1);
	}
}
