package GenerateRandomNumbers;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberByUsing3rdPartyAPI {
	public static void main(String[] args) {
		//The below line returns the String value.
		//At the Brackets we are Specifying a number that denotes how much digit it will be return 
		String randomNumeric = RandomStringUtils.randomNumeric(5);
		System.out.println(randomNumeric);
	}
}
