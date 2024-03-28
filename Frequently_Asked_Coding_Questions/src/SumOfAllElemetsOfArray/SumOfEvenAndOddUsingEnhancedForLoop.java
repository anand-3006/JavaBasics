package SumOfAllElemetsOfArray;
import java.util.*;
public class SumOfEvenAndOddUsingEnhancedForLoop {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int EvenSum = 0;
		int OddSum = 0;
		int arr_size = 0;
		System.out.println("Enter the size of an Array");
		if(sc.hasNextInt()) {
			arr_size = sc.nextInt();
		}
		int arr[] = new int[arr_size];
		System.out.println("Enter the elem	ents of an array");
		for(int i = 0; i < arr_size; i++) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		for(int Sum : arr) {
			if(Sum % 2 == 0) {
				EvenSum = EvenSum + Sum;
			}else {
				OddSum = OddSum + Sum;
			}
		}
		System.out.println("The Sum Of Even Numbers are : "+EvenSum);
		System.out.println("The Sum Of Odd Numbers are : "+OddSum);
	}
}