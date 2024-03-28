package Arrays;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int columns = sc.nextInt();
		int[][] numbers = new int[row][columns];
		System.out.println("Enter the values");
		//To control row input
		for(int i = 0; i < row; i++) {
			//to control column input
			for(int j = 0; j < columns; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		//output
		System.out.println("The 2D Array is : ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		//find the given number index
		System.out.println("Enter a number to find its index number : ");
		int x = sc.nextInt();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {
				if(numbers[i][j]==x) {
					System.out.println("Then index number of given number is : ["+i+","+j+"]");
				}
			}
		}
	}
}
