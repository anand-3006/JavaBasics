package RecursionFunctions;

import java.util.Scanner;

public class CalculatingStackTopBylogn {
	public static int CalculartePower(int a, int n) {
		if(a == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		if(n%2==0) {
			int power = CalculartePower(a, n/2) * CalculartePower(a, n/2);
			return power;
		}
		else {
			int power1 = CalculartePower(a, n/2) * CalculartePower(a, n/2) * a;
			return power1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println(CalculartePower(a, n));
	}
}
