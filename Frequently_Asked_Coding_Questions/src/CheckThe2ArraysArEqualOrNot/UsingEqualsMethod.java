package CheckThe2ArraysArEqualOrNot;

import java.util.Arrays;

public class UsingEqualsMethod {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] s = {1,2,3,4,5};
		boolean status = Arrays.equals(a, s);
		if(status == true) {
			System.out.println("The given two arrays are Equal or Same");
		}else {
			System.out.println("The given two arrays are Not Equals or Not same");
		}
	}
}
