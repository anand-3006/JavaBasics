package Loops;
import java.util.*;
public class TableForUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The table of given number is : "+n);
		for(int i = 1; i <= 10; i++) {
		System.out.println(n+" * "+i+" = "+i*n);
		}
	}
}
