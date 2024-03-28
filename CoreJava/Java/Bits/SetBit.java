package Bits;
//Setting the bit
public class SetBit {

	public static void main(String[] args) {
		int i = 3;//the binary is 0011
		int pos = 4;
		int bitMask = 1<<pos;//0001 << 4 = 10000 in this line 1 moving left to 4 digit it will bcm 10000
		int j = bitMask | i;//10000 | 00011 = 10011 in this line we are applying or operator on the bits so result 00011
		System.out.println(j);//Ans : 19 bcz 19 binary number is 10011
	}
}