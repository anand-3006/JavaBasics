package Arrays;
import java.util.*;
public class marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] mark = new int[a];//OR we can write this syntax like int mark[]=new int[a];
		System.out.println("Enter marks along with subjects");
		System.out.println("Enter Physics marks : ");
		mark[0] = sc.nextInt();
		System.out.println("Enter Math marks : ");
		mark[1] = sc.nextInt();
		System.out.println("Enter English marks : ");
		mark[2]= sc.nextInt();
		System.out.println("The marks of subjects are : ");
		for(int i = 0; i < a;i++) {
			System.out.println(mark[i]);
		}
	}
}
