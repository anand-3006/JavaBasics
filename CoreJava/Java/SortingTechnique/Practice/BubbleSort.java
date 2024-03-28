package SortingTechnique.Practice;

public class BubbleSort {
	//Bubble sort starts sorting from 0th index and move the bigger elements last and automatically lighter elements comes first
	public static void PrintSortedElements(int arr[]) {
		System.out.println("The sorted elements are : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,8,2,1,4,3,6,5};
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {//this condition is gives us ascending order if u wand in descending instead of > add <
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		PrintSortedElements(arr);
	}
}
