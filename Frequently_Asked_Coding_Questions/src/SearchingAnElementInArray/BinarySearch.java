package SearchingAnElementInArray;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter a element");
		int search = sc.nextInt();
		int l = 0;
		int h = arr.length-1;
		boolean sts = false;
		while(l <= h) {
			int m = (l + h)/2;
			if(arr[m] == search) {
				System.out.println("The given element is found");
				sts = true;
				break;
			}
			if(arr[m] < search) {
				l = m + 1;
			}else {
				l = m - 1;
			}
		}
		if(sts == false) {
			System.out.println("Element is not found!!");
		}
	}
}
