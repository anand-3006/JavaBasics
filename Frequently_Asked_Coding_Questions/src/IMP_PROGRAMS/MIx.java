package IMP_PROGRAMS;

import java.util.Arrays;
import java.util.Scanner;

public class MIx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		//to take input for array
		System.out.println("Enter the array elements");
		for(int i = 0; i <= size -1;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i <= size - 1; i++) {
			//sort the elements
			for(int j = 0; j < size-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.print("The sorted elements are : "+Arrays.toString(arr));
//			System.out.println();
//			System.out.println("Enter the element to search");
//			int search = sc.nextInt();
//			boolean sts = false;
//			//linear search
//			for(int j = 0; j < size - 1; j++) {
//				if(arr[j] == search) {
//					System.out.println("The given element "+search+" is found at index : "+j);
//					sts = true;
//					break;
//				}
//			}
//			if(sts == false) {
//				System.out.println("The given element "+search+" is not found!!");
//			}
			break;
		}
	}
}
