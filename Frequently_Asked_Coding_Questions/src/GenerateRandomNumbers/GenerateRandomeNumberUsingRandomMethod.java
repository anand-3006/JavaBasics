package GenerateRandomNumbers;
import java.util.*;
public class GenerateRandomeNumberUsingRandomMethod {
	public static void main(String[] args) {
		Random random = new Random();
		int i = 10;
		int random_int = random.nextInt(i);
		//Here it will generate the random number from 1 to 9 
		System.out.println("The randome number generated from given number is : "+random_int);
	}
}
