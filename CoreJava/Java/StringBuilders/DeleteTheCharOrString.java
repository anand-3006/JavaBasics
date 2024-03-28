package StringBuilders;

public class DeleteTheCharOrString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("My name is : Anand");
		System.out.println(sb);
		//here deleting the char at given index
		sb.deleteCharAt(11);
		System.out.println(sb);
		//here deleting the string through start index to end index 
		sb.delete(0, 12);
		System.out.println(sb);
	}
}
