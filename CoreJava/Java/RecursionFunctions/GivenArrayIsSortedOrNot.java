package RecursionFunctions;
//Time complexity of this program is O(n) here n is array length
import java.util.Scanner;

public class GivenArrayIsSortedOrNot {
	public static boolean isSorted(int[] arr, int idx) {
		if(idx == arr.length-1) {
			System.out.println("The array is sorted");
			return true;
		}
		
		if(arr[idx] < arr[idx+1]) {
			return isSorted(arr, idx+1);
		}else {
			System.out.println("The array is not sorted");
			return false;
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int arr_size = sc.nextInt();
		int[] array = new int[arr_size];
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < arr_size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(isSorted(array, 0));
	}
}
