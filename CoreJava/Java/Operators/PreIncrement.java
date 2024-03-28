package Operators;

public class PreIncrement {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		//Below line first the a value is get increment and then that(Incremented) value will be assigned to b
		//1) Change value  
		//2) Use value
		b = ++a;
		
		System.out.println(a);
		System.out.println(b);
	}
}
