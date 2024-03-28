package SearchingAnElementInArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBySorMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//for user Input from user
		for(int i = 0; i<= arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		//To print the array elements 
		for(int i = 0; i <= arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			break;
		}
	}
}
