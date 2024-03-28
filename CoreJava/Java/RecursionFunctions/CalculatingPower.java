package RecursionFunctions;

import java.util.Scanner;

public class CalculatingPower {
	public static int PowerCal(int a, int n) {
		if(a == 0) {
			System.out.println("The zero value power is zero");
			return 0;
		}
		if(n == 0) {
			System.out.println("The number that power is zero then it's value is 1");
			return 1;
		}
		int powerC = PowerCal(a, n-1);
		int power = a * powerC;
		return power;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		System.out.println(a+" Power "+n+" is : "+PowerCal(a, n));
	}
}
