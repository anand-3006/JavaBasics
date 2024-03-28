package Basic_Programs;
import java.util.*;
public class KMInMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of KM");
		int s = sc.nextInt();
		double miles = s * 0.621371;
		System.out.println("The KM in miles : "+miles);
	}
}
