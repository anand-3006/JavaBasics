package Basic_Programs;
import java.util.*;
public class FibbonaciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate its fibbonaci number");
		int a = sc.nextInt();
		int a1 = 0;
		int a2 = 1;
		int temp;
		for(int i = 1; i <= a; i++) {
			System.out.print(a1+" ");
			temp = a1 + a2;
			a1 = a2;
			a2 = temp;
		}
	}
}
