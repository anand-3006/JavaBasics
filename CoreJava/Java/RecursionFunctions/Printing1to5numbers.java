package RecursionFunctions;

import java.util.Scanner;

public class Printing1to5numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a initial number : ");
		int n = sc.nextInt();
		printNumbers(n);
	}
	public static void printNumbers(int n) {
		int a = 8;
		if(n == a) {
			return;
		}
		System.out.println(n);
		printNumbers(n+1);
	}
}
