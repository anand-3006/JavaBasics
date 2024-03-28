package Bits;
//Get Bit
public class GetBits {
	//From this code we are getting the position of the bit is consist ZERO or ONE 
	public static void main(String[] args) {
		int i = 27;//this is the represent number & internally converts into the ZERO & ONE
		int pos = 4;//this is number of the position of the bit
		int bitMask = 1<<pos;//this is the function need to perform to get the bits  
		if((bitMask & i) == 0) {//here we are operating the & operator with the given number and comparing with ZERO
			System.out.println("Bit was zero");
		}else {
			System.out.println("Bit was One");
		}
	}
}
