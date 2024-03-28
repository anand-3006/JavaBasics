package Bits;
//to make 0 into 1 do the SetBit()
// 1) give a number ex:int num = 5
// 2) give the position ex:int pos = 2
// 3) do BitMask = 1<<pos
// 4) on BitMask apply AND operator with num ex:int and = BitMask & num
// 5) print and
//to make 1 into 0 do the ClearBit follow the below steps
// 1) give a number ex:int num = 5
// 2) give the position ex:int pos = 2
// 3) do BitMask = 1<<pos
// 4) on BitMask apply NOT operator ex:int not = ~BitMask 
// 5) on not apply AND operator with num ex:int and = not & num
// 6) print the and
import java.util.*;
public class UpdateBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num : ");
		int num = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		if(b == 0){
			//in this we are setting value as 0 means performing ClearBit
			System.out.println("In this we are updating the value as 0(Zero) using ClearBit Concept!!");
			System.out.println("Enter the value you want change value of possition : ");
			int pos = sc.nextInt();
			int BitMask = 1<<pos;
			int not = ~BitMask;
			int and = not & num;
			System.out.println("The updated value is : "+and);
		}else if(b == 1){
			//in this we are setting value as 1 means performing SetBit
			System.out.println("In this we are updating the value as 1(1) using SetBit Concept!!");
			System.out.println("Enter the value you want change value of possition : ");
			int pos = sc.nextInt();
			int BitMask = 1<<pos;
			int and = BitMask | num;
			System.out.println("The updated value is : "+and);
		}else {
			//here we are printing invalid number
			System.out.println("Invalid input!!");
			
		}
	}

}
