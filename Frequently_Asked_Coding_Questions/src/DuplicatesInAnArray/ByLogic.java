package DuplicatesInAnArray;

public class ByLogic {
	public static void main(String[] args) {
		String[] arr = {"Anand","Satish","Mahesh","Dinesh","Sagar","Dinesh","Hanumanth","Anand","Mahesh"};
		boolean sts = false;
		int count = 1;
		for(int i = 0; i < arr.length;i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate values are : "+arr[i]+" @index number : "+j);
					sts = true;
				}
			}
		}
		if(sts == false) {
			System.out.println("There is no any duplicate value found!!!!");
		}
	}
}
