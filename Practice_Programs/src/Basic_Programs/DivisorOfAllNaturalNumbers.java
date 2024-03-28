package Basic_Programs;
import java.util.*;
public class DivisorOfAllNaturalNumbers {
	//natural numbers mean the number which divides itself and by 1 those numbers are known as natural numbers 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		System.out.println("The divisor of the given number "+a+" are");
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
