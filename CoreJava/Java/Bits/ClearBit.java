package Bits;

public class ClearBit {
	public static void main(String[] args) {
		int i = 5;//binary is 0101 
		int pos = 2;//this is the position where we want clear the original value
		int BitMask = 1<<pos;// 0001<<2 = 0100
		int not = ~BitMask;//in this we are applying not operator means it will change 0 into 1 and 1 into 0
		int and = not & i;//1011 & 0101 = 0001
		System.out.println(and);//ans = 1 the binary of one is 0001
	}
}
