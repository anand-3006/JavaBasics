package SumOfAllElemetsOfArray;

import java.util.Scanner;

public class SumOfAnArrayUsingEnhancedForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];
        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int val : arr) {
        	sum = sum + val;
        }
        System.out.println("The Sum of an array elements is : "+sum);
        }
	}
