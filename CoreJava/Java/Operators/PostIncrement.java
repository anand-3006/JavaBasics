package Operators;

public class PostIncrement {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//Below line the value of a is assigned to the b then a value will increment
		//1) Use value 
		//2) Change value
		b = a++;
		System.out.println(a);
		System.out.println(b);
	}
}
