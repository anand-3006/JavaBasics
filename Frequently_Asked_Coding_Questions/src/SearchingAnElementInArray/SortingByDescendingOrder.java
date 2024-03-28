package SearchingAnElementInArray;

import java.util.Arrays;
import java.util.Collections;

public class SortingByDescendingOrder {
	public static void main(String[] args) {
		Integer arr[] = {2,8,9,4,5,6,7};
			Arrays.sort(arr,Collections.reverseOrder());
			System.out.println(Arrays.toString(arr));
		}
	}
