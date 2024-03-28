package FactorialNumber;
//A number that multiplies a number by every number below it
// ex : 5 means it will multiplied by 1 * 2 * 3 * 4 * 5 = 120
public class FactorialNumberUsingForLoop {
	public static void main(String[] args) {
		int a = 5;
		int factorial = 1;
		//By Ascending Order
		for(int i = a; i > 0; i--) {
			factorial = factorial * i;
		}
		//OR
		int factorial1 = 1;
		//By descending Order
		for(int i = 1; i <= a; i++) {
			factorial1 = factorial1 * i;
		}
		System.out.println("The factorial number of given number By Ascending Order is : "+factorial);
		//OR
		System.out.println("The factorial number of given number By Descending Order is : "+factorial1);
	}
}
