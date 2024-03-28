package StringBuilders;

public class FindCharAtIndex {
	public static void main(String[] args) {
		//Finding the Character at a given index
		//index is start from 0
		StringBuilder sb = new StringBuilder("Anand Basagouda Shiraganve");
		System.out.println("The character at given index is : "+sb.charAt(0));
		System.out.println("My father name is : "+sb.substring(6, 15));
	}
}
