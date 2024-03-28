package IfElse;
import java.util.*;
public class GreaterOrLess {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		if(a < b) {
			System.out.println("Here a is less than b");
		}else {
			System.out.println("Here a is greater than  b");
		}
	}
}
