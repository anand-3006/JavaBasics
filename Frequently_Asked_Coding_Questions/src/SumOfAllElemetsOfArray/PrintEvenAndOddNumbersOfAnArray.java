package SumOfAllElemetsOfArray;

public class PrintEvenAndOddNumbersOfAnArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		//Using Normal for loop printing Even numbers
		System.out.println("Using Normal for loop The even numbers are");
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			}
		
		//Using Enhanced for loop printing Even numbers
		System.out.println("Using Enhance for loop The even numbers are");
		for(int val : a)
		{
			if(val%2 == 0) {
			System.out.println(val);
		}
		}
	
	
	//Using Normal for loop printing Even numbers
		System.out.println("Using Normal for loop The Odd number are");
	for(int i = 0; i <= a.length-1;i++) {
		if(a[i] %2 != 0) {
			System.out.println(a[i]);
		}
	}
	
	//Using Enhanced for loop printing Odd numbers
	System.out.println("Using Enhanced for loop The Odd number are");
	for(int Odd : a) {
		if(Odd % 2 != 0) {
			System.out.println(Odd);
		}
	}
}
	
}
