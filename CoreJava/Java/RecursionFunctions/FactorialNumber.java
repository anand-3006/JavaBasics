package RecursionFunctions;

public class FactorialNumber {
	public static int factorialNumber(int n) {
		//Base condition and returning 1 as value in these conditions
		if(n == 1 || n == 0) {
			return 1;
		}
		//Calling function and stored into a new variable and from here we get the next value
		//Example the n value is 5 then from here we get the 4 after this 3 till 1 
		//It is work like for loop
		int fac_nm1 = factorialNumber(n-1);
		//Below the main work is going on the factorial number calculation
		int fac_num = n * fac_nm1;
		//Returning the calculated value of factorial number to the function 
		return fac_num;
	}
	public static void main(String[] args) {
		// we can also write like this 
		//Below line we are assigning the a value for a variable
		int n = 4;
		//Calling the above defined function and assigning into another variable
		int fac_number = factorialNumber(n);
		//In the print statement we used the above defined variable
		System.out.println("The factorial number of given number "+n+" is : "+fac_number);
		
		//OR
		//Below line we are calling the function and assigning the value directly inside print line
		System.out.println("The factorial number of given number is : "+factorialNumber(3));
	}
}
