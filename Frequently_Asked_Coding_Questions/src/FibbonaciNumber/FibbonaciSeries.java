package FibbonaciNumber;
import java.util.*;
public class FibbonaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int a1 = 0;
		int a2 = 1;
		int temp;
		System.out.println(a1+" "+a2+" ");
		for(int i = 2; i < a; i++) {
			temp = a1 + a2;
			System.out.print(temp+" ");
			a1 = a2;
			a2 = temp;
		}
	}
}
