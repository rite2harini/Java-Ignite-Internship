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
import java.util.Scanner;
public class Sales_dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] sales = new int[3][4];
		System.out.println("Enter the sales for three branches in the four months consecutively:");
		for(int i=0;i<sales.length;i++)
		{
			for(int j=0;j<sales[i].length;j++)
			{
				sales[i][j]= sc.nextInt();
			}
		}
		System.out.println("\nDisplaying the sales details: (in Rs.)");
		double total=0;
		for(int i=0;i<sales.length;i++)
		{
			for(int j=0;j<sales[i].length;j++)
			{
				System.out.printf(sales[i][j]+"\t");
				total+=sales[i][j];
			}
			System.out.println();
		}
		System.out.println("Total sales: Rs."+total);
		double branch1_sale=0; 
		double branch2_sale=0;
		double branch3_sale = 0;
		for(int j=0;j<sales[0].length;j++)
		{
			branch1_sale+=sales[0][j];
		}
		for(int j=0;j<sales[1].length;j++)
		{
			branch2_sale+=sales[1][j];
		}
		for(int j=0;j<sales[2].length;j++)
		{
			branch3_sale+=sales[2][j];
		}
		System.out.println("Branch 1 sales: Rs."+branch1_sale);
		System.out.println("Branch 2 sales: Rs."+branch2_sale);
		System.out.println("Branch 3 sales: Rs."+branch3_sale);
		if(branch1_sale>branch2_sale)
		{
			if(branch1_sale>branch3_sale)
			{
				System.out.println("Branch 1 has the highest sales!");
			}
			else
			{
				System.out.println("Branch 3 has the highest sales!");
			}
		}
		else
		{
			if(branch2_sale>branch3_sale)
			{
				System.out.println("Branch 2 has the highest sales!");
			}
			else
			{
				System.out.println("Branch 3 has the highest sales!");
			}
		}
		
		sc.close();
	}

}
