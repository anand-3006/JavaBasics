package Basic_Programs;
import java.util.*;
public class EvenOrOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd : ");
		int a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println("The entered number "+a+" is Even Number!!");
		}else {
			System.out.println("The entered number "+a+" is Odd Number");
		}
	}
}
