package Basic_Programs;
import java.util.*;
public class PossitiveOrNegativeOrZero {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a = sc.nextInt();
			if(a == 0) {
				System.out.println("The given number is Zero(0)");
			}else if(a < 0) {
				System.out.println("The given number is Negative");
			}else {
				System.out.println("The given number is Possitive");
			}
	}
}