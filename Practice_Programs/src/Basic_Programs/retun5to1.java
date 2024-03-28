package Basic_Programs;

public class retun5to1 {
	public static void main(String[] args) {
		System.out.println("Even numbers are : ");
		int odd = 0;
		for(int i = 5; i > 0; i--) {
			if(i%2==0) {
			System.out.println(i);
			}else {
			odd = i;
			}
		}
		System.out.println(odd);
	}
}
