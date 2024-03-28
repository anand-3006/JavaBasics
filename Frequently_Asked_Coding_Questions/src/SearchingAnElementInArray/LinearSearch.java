package SearchingAnElementInArray;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,20};
		int search = 20;
		boolean sts = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == search) {
				System.out.println("The element "+search+" found at index number : "+i);
				sts = true;
				continue;
			}
		}
		if(sts == false) {
			System.out.println("The elements is not present in the array");
		}
	}
}
