package PalindromeNumber;
import java.util.*;
public class UsingAlgorithm {
	//THE NUMBER AFTER REVERSING AND THE ORIGINAL NUMBERS ARE SAME THEN IT'S KNOWN AS PALINDROME NUMBER
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int og = a;
		int rev = 0;
		while(a > 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		if(og == rev) {
			System.out.println("The given number is Palindrome");
		}else {
			System.out.println("The given number is not Palindrome");
		}
	}
}
