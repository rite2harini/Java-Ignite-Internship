/*
Advanced – Company Sales Dashboard (2D Array)

Create a program that:

A company has sales data for 3 branches and 4 months.

Store the sales data in a 2D array.

Calculate:

Total sales of each branch
Overall company sales
Branch with the highest total sales
Example Structure
Branch 1 -> Jan Feb Mar Apr
Branch 2 -> Jan Feb Mar Apr
Branch 3 -> Jan Feb Mar Apr
Hint

Use nested loops.
*/
package java_intership_day8;
import java.util.Scanner;
public class Company_sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int [3][4];
		int i,j,br=1;
		
		System.out.println("Enter the details :\n");
		for(i=0;i<3;i++) {
			System.out.println("For branch "+ br);
			for(j=0;j<4;j++) {
				arr[i][j] = sc.nextInt();
			}
			br++;
		}
		System.out.println("The output :");
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
