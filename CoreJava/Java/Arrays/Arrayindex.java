package Arrays;
import java.util.*;
public class Arrayindex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = sc.nextInt();
		int numbers[] = new int[a];
		System.out.println("Enter the numbers : ");
		for(int i = 0; i < a; i++) {
			numbers[i] = sc.nextInt(); 
		}
		//taking input to fetch the index number of a number
		System.out.println("Enter the number to find its index number : ");
		int b = sc.nextInt();
		for(int i = 0;i < numbers.length;i++) {
			if(numbers[i] == b) {
				System.out.println("The b number found on index number : "+i);
			}
		}
	}
}
