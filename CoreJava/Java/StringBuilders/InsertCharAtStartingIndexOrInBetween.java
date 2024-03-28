package StringBuilders;

public class InsertCharAtStartingIndexOrInBetween {
	public static void main(String[] args) {
		//using this program we can insert the new char at any index
		StringBuilder sb = new StringBuilder("Anand");
		sb.insert(5, 'a');
		System.out.println(sb);
	}
}
