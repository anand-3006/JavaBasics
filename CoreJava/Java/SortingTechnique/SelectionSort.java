package SortingTechnique;

public class SelectionSort {
	public static void printSelectionSort(int arr[]) {
		System.out.println("The selection sorted elements are : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,2,5,1,3,7,4,6,8};
		//selection sort 
		//The time complexity is O(n^2)
		for(int i = 0; i < arr.length-1; i++) {
			int small = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[small] > arr[j]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
		printSelectionSort(arr);
	}	
}
