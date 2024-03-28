package Functions;
import java.util.*;
public class Callingfunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Entered name is : "+str);
		printname(str);
	}
	public static void printname(String str) {
		System.out.println("The output is : "+str);
		return;
	}
}
