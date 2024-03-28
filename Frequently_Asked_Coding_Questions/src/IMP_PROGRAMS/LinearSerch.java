package IMP_PROGRAMS;
import java.util.*;

public class LinearSerch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,40,60,80,30,20,40,20};
		System.out.println("Enter a number");
		int search = sc.nextInt();
		boolean sts = false;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==search) {
				System.out.println("The given element "+search+" is present at the index number : "+i);
				sts = true;
				continue;
			}
		}
		if(sts==false) {
			System.out.println("The given element "+search+" is not present in the array!!");
			System.out.println("Please eneter the valid input!!");
		}
	}
}
