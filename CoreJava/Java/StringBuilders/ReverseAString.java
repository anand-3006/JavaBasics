package StringBuilders;

public class ReverseAString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AnandS");
		System.out.println("The Original String is : "+sb);
		//for loop for reverse the original string
		for(int i = 0;i<sb.length()/2;i++) {
			//fetching the index numbers
			int front = i;
			int back = sb.length()-1-i;
			
			//replacing characters
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			//setting the chars
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.println("After reversing the string is : "+sb);
	}
}
