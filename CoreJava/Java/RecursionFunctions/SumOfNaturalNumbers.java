package RecursionFunctions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial value of i : ");
		int i = sc.nextInt();
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		//Below we are calling the function in the main method
		//Also initialized the values
		printOfNaturalNumbers(i, n, 0);
	}
	//i is denotes which numbers we are belongs or present
	//n is denotes what is our base condition
	//sum is carry the sum of the natural number
	public static void printOfNaturalNumbers(int i, int n, int sum) {
		//Below we are defining Base condition and returning the Control back and printing the value
		if(i == n) {
			sum = sum + i;
			System.out.println("The sum of natural number is : "+sum);
			return;
		}
		//below line also we can write "sum = sum + i; in this we are adding the every number into previous number"
		sum += i;
		//below we are calling same function and also providing the increment condition
		printOfNaturalNumbers(i+1, n, sum);	
	}
}
