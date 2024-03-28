package MissingElementsInAnArray;

public class MisingElements {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,9};
		int sum1 = 0;
		for(int i = 0; i < a.length;i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println(sum1);
		int sum2 = 0;
		for(int i = 1; i <= a.length+1; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		System.out.println("The missing number is : "+(sum2 - sum1));	
	}
}
