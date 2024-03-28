package ReverseString;

public class ReversWordUsingStringBuilder {
	public static void main(String[] args) {
		String str = "My name is Anand";
		String[] split = str.split("\\s");
		String rev_word = "";
		for(String word : split) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			rev_word = rev_word + sb+ " ";
		}
		System.out.println(rev_word);
	}
}
