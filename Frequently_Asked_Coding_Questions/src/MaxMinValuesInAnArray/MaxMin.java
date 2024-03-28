package MaxMinValuesInAnArray;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("Enter the elements of an Array");
		for(int i = 0; i < arr_size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for(int i = 0; i < arr_size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The max value of array is : "+max);
		System.out.println("The min value of array is : "+min);
	}
}
