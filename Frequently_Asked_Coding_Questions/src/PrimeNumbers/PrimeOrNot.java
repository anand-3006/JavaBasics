package PrimeNumbers;
import java.util.*;
public class PrimeOrNot {
	//The number divided by itself and by 1 is known as PRIME NUMBER
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int count = 0;
		if(a > 1) {
			for(int i = 1; i <= a; i++) {
				if(a % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("The given number is a Prime Number");
			}else {
				System.out.println("The given number is not a Prime Number");
			}
		}else {
			System.out.println("The given number is not a Prime Number");
		}
	}
}