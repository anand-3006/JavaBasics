package StringBuilders;

public class InseertingNewString {
	public static void main(String[] args) {
		//using this program we can insert the a new string into the old string
		StringBuilder sb = new StringBuilder("Anand");
		sb.insert(0, "My name is : ");
		System.out.println(sb);
	}
}
