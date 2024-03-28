package IMP_PROGRAMS;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {9,5,6,2,3,4,8};
		System.out.println("Array elements before swaping : "+Arrays.toString(a));
		//For loop for Pass
		for(int i = 0; i < a.length-1;i++) {
			//For loop for Iteration
			for(int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Array elements before swaping : "+Arrays.toString(a));
	}
}
