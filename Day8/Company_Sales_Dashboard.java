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
package java_internship_assignment;

import java.util.Scanner;

public class companysalesdashboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [][]sales=new int[3][4];
		int i,j;
		
		for(i=0;i<3;i++)
		{	
			
			for(j=0;j<4;j++)
			{	
				System.out.printf("Enter the sales data of the %d branch for the %d month\n ",i+1,j+1);
				sales[i][j]=sc.nextInt();
			}
		
		}
		int highest=0;
		int totalsales=0;
		int branch=0;
		for(i=0;i<3;i++)
		{	int branchsales=0;	
			for(j=0;j<4;j++)
			{	
				branchsales=branchsales+sales[i][j];
			}
			System.out.printf("Branch Sales  of %d branch is %d\n ",i+1,branchsales);
			
			if(branchsales>highest)
			{	
				highest=branchsales;
				branch=i+1;
			
			}
				
			totalsales=totalsales+branchsales;
		}
			
			
		System.out.printf("Highest sales is of branch %d \n ",branch);
		
		System.out.printf("Total sales of company is  %d \n ",totalsales);
		
		}

}

