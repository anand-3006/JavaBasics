package Basic_Programs;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();	
		for(int i = 1; i <= 10; i++) {
			int result = a * i;
			System.out.println(a+" * "+i+" = "+result);
		}
	}
}
