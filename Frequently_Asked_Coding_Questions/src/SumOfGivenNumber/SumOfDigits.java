package SumOfGivenNumber;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int sum = 0;
		while(a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		System.out.println("The sum of given number is : "+sum);
	}
}