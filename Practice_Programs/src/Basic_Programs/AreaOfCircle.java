package Basic_Programs;
import java.util.*;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double a = sc.nextDouble();
		double area = Math.PI * a * a;
		System.out.println("The area of cirle is : "+area);
	}
}
