package OccuraceCharactor;

public class OccuranceCount {
	public static void main(String[] args) {
		String str = "My name is anand";
//		int length = str.length();
//		int count = str.replace("a", "").length();
//		int count1 = length - count;
//		System.out.println("The char a is repeted count is : "+count1);
		str = str.replaceAll("[^a-zA-Z]", "");
		int[] count = new int[256];
		for(int i = 0; i < str.length();i++) {
			count[(int) str.charAt(i)]++;
		}
		for(int j = 0; j < 256;j++) {
			if(count[j]!=0) {
				System.out.println((char)j+" Count is : "+count[j]);
			}
		}
//		System.out.println(count);
	}
}
