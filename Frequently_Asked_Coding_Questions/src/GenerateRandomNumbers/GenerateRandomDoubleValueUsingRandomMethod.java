package GenerateRandomNumbers;

import java.util.Random;

public class GenerateRandomDoubleValueUsingRandomMethod {
	public static void main(String[] args) {
		Random ran = new Random();
		double nextDouble = ran.nextDouble();
		//Here we need not to provide any parameter here because by default value is 0.0 to 1.0
		System.out.println("The randome double values are : "+nextDouble);
	}
}
