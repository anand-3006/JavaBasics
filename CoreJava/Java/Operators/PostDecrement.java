package Operators;

public class PostDecrement {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//1) Use value  
		//2) Change value
		//In the below line firstly a value is assigning to b and then the value of a is Decreasing by 1
		b = a--;//b = 10-1 = 9, So b = 10 and a value is 9
		System.out.println(a);
		System.out.println(b);
	}
}
