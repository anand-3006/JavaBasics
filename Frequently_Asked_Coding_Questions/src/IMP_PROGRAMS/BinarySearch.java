package IMP_PROGRAMS;
public class BinarySearch {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		//System.out.println("Enter a number to search in the given array");
		int b = 3 ;
		
		int l = 0;
		int h = arr.length-1;
		boolean sts = false;
		while(l <= h) {
			int m = (l + h)/2;
			if(arr[m]==b) {
				System.out.println("The number is present");
				sts = true;
				break;
			}
			if(arr[m] < b) {
				l = m + 1;
			}if(arr[m] > b) {
				l = m - 1;
			}
		}
	if(sts == false) {
		System.out.println("The element is not present inside the array!!");
	}
	}
}
