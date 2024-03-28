package GenerateRandomString;

import org.apache.commons.lang3.RandomStringUtils;

public class Using3rdPartyAPI {
	public static void main(String[] args) {
		//It will return a String Value.
		//In the Bracket we are specifying the how much characters that needs to generate.
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(4);
		System.out.println(randomAlphabetic);
	}
}
