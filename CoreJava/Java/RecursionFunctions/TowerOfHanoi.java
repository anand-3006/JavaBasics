package RecursionFunctions;
//Time complexity of this program is O(2^n)
import java.util.Scanner;

//RULES
//1. Only one disk transfered in 1 step
//2. Smaller disks are always kept on top of larger disks
public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		towerOfHanoi(n,"S","H","D");
	}

	private static void towerOfHanoi(int n, String src, String help, String dest) {
		// TODO Auto-generated method stub
		//Base Condition
		if(n == 1) {
			System.out.println("Transfered disk "+n+" from "+src+" to "+dest);
			return;
		}
		//Calling function and given some conditions
		towerOfHanoi(n-1, src, dest, help);
		System.out.println("Transfered disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1, help, src, dest);
	}

}
