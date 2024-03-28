package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingByParallelSortMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//to take input from user
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		//to print array
		System.out.println("The sprted array elements are : ");
		for(int i = 0; i < arr.length; i++) {
			Arrays.parallelSort(arr);
			System.out.println(Arrays.toString(arr));
			break;
		}
	}
}
