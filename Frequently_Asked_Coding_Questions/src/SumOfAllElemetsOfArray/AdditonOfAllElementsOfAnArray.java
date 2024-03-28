package SumOfAllElemetsOfArray;

import java.util.Scanner;

public class AdditonOfAllElementsOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of an array");
		int array_size = 0;
		if(sc.hasNextInt()) {
			array_size = sc.nextInt();
		}
		int arr[] = new int[array_size];
		System.out.println("Enter the array elements");
		for(int i = 0; i < array_size;i++) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of the elements are : "+sum);
	}
}
