package StringBuilders;

public class SetCharAtIndex {
	public static void main(String[] args) {
		//Using this program we can change the char at a given string example Anand to Snand
		StringBuilder sb = new StringBuilder("Anand");
		sb.setCharAt(0, 'S');
		System.out.println(sb);
	}
}
