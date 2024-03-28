package SortingTechnique.Practice;

public class SelectionSort {
//In this we are comparing a element present in the starting index with all elements and lastly making a swap for a iteration
	public static void print(int arr[]) {
		System.out.println("The sorted values are : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,1,2,6,7,3,4,8};
		for(int i = 0; i < arr.length-1; i++) {
			int small = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[small]>arr[j]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
		print(arr);
	}
}
