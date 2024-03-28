package StringBuilders;

public class AppendNewCharOrStringIntoTheOldString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A");
		System.out.println("Starting String is : "+sb);
		//adding characters
		sb.append('n');
		sb.append('a');
		sb.append('n');
		sb.append('d');
		System.out.println("After adding the characters one by one : "+sb);
		//Adding string
		sb.append(" Basagouda Shiraganve");
		System.out.println("After adding the String : "+sb);
		
	}
}
