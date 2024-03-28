package Arrays;
import java.util.*;
public class arrayiopo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = sc.nextInt();
		int numbers[] = new int[a];
		//to take input from user
		for(int i = 0; i < a; i++) {
			numbers[i] = sc.nextInt();
		}
		//to print numbers
		for(int i = 0; i < a; i++) {
			System.out.println(numbers[i]);
		}
	}
}