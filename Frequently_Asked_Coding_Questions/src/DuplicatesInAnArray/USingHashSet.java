package DuplicatesInAnArray;

import java.util.HashSet;

//Here HashSet doesn't allow duplicates
public class USingHashSet {
	public static void main(String[] args) {
	String[] s = {"Anand","Satish","Mahesh","Dinesh","Sagar","Dinesh","Hanumanth","Anand","Mahesh"};
	HashSet <String>l = new HashSet();
	boolean sts = false;
	for(String a : s) {
		if(l.add(a) == false) {
			System.out.println("The Duplicate elements are : "+a);
			sts = true;
		}
	   }
	if(sts == false) {
		System.out.println("There is no duplicate values found!!");
	}
	}
}
