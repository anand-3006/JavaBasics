package Strings;
import java.util.*;
public class Strings {
	//Strings are immutable means we can't change the value once its added.
	//If you want to modify the string then every time it will create a new string and it will point out 
	//the a new string so it is slow 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name : ");
//		String name = sc.next();//next() function is used to take a single word
//		System.out.println("My Name Is : "+name);
		//System.out.println();
		System.out.println("Enter your full name : ");
		String full_name = sc.nextLine();//nextLine() function is used to take sentence
		System.out.println("My full name is : "+full_name);
	}
}
