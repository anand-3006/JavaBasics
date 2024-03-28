package Operators;

public class PreDecrement {
	public static void main(String[] args) {
		//
		int a = 10;
		int b = 5;
		//1) Change value  
		//2) Use value
		//In the below line firstly the a value is decreasing by one and assigning to as b value 
		b = --a;//b = 1-10=9, So b = 9 and also a value is 9
		System.out.println(a);
		System.out.println(b);
	}
}
