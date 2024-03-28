package CheckThe2ArraysArEqualOrNot;

public class UsingLogic {
	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		int[] b = {1,2,3,4,5};
		boolean sts = true;
		if(a.length == b.length) {
			for(int i = 0; i < a.length;i++) {
				if(a[i] == b[i]) {
					sts = true;
				}else {
					sts = false;
				}
			}
		}else {
			sts = false;
		}
		if(sts == true) {
			System.out.println("The array elements are same");
		}else {
			System.out.println("The arra elements are not same");
		}
	}
}
