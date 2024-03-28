package Basic_Programs;
	import java.util.*;
	public class SmallestAmongThreeNumbers {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a = sc.nextInt();
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			System.out.println("Enter the value of c");
			int c = sc.nextInt();
			//condition
			if(a < b && a < c) {
				System.out.println("The value of a is smallest : "+a);
			}else if(b < c && b < a) {
				System.out.println("The value of b is smallest : "+b);
			}else {
				System.out.println("The value of c is smallest : "+c);
			}
		}
	}
