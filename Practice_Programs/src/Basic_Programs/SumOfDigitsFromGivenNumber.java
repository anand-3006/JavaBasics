package Basic_Programs;
import java.util.*;
public class SumOfDigitsFromGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate its sum");
		int a = sc.nextInt();
		sc.close();
		int sum = 0;
		while(a > 0) {
			int reminder = a % 10;
			sum = sum + reminder;
			a = a / 10;
		}
		System.out.print("Sum of the given number digit is : "+sum);
	}
}
