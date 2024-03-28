package ReverseString;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "My name is Anand";
		String[] split = str.split(" ");
		String revers = "";
		for(String word : split) {
			String rev_word = "";
			for(int i = word.length()-1; i>=0;i--) {
				rev_word = rev_word + word.charAt(i);
			}
			revers = revers + rev_word + " ";
		}
		System.out.println("The revers words in a string is : "+revers);
	}
}
