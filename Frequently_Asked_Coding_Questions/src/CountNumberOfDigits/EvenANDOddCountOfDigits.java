package CountNumberOfDigits;
import java.util.*;
public class EvenANDOddCountOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long a = sc.nextInt();
		int counta = 0;
		int countb = 0;
		while(a > 0) {
			if(a%2==0) {
				counta++;
			}else {
				countb++;
			}
			a = a / 10;
		}
		System.out.println("The even numbers count is : "+counta);
		System.out.println("The odd numbers count is : "+countb);
	}
}
