package SumOfAllElemetsOfArray;
import java.util.*;
public class SumOfEvenAndOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int EvenSum = 0;
		int OddSum = 0;
		int array_size = 0;
		System.out.println("Enter the size of an array");
		if(sc.hasNextInt()) {
			array_size = sc.nextInt();
		}
		
		int arr[] = new int[array_size];
		System.out.println("Enter the elements of an array");
		for(int i = 0; i < array_size; i++) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		for(int i = 0; i <= arr.length-1;i++) {
			if(arr[i]%2==0) {
				EvenSum = EvenSum + arr[i];
			}else {
				OddSum = OddSum + arr[i];
			}
		}
		System.out.println("The EvenNumber sum of an array is : "+EvenSum);
		System.out.println("The OddNumber sum of an array is : "+OddSum);
	}
}
