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
public class Company_Sales_Dashboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Total_sales_Branch_1=0;
        int month;
        int Total_sales_Branch_2=0;
        int Total_sales_Branch_3=0;
       int Total_Sales=0;
       System.out.println("Enter the Sales in Branch A  ");
       for(int i=0;i<4;i++)
       {
            System.out.print("Enter Sales in month "+(i+1)+": ");
            month = sc.nextInt();
            Total_sales_Branch_1 += month;
            
       }
       System.out.println("***********************");
       System.out.println("Enter the Sales in Branch B  ");
       for(int i=0;i<4;i++)
       {
            System.out.print("Enter Sales in month "+(i+1)+": ");
            month = sc.nextInt();
            Total_sales_Branch_2 += month;
            
       }
       System.out.println("***********************");
       System.out.println("Enter the Sales in Branch C  ");
       for(int i=0;i<4;i++)
       {
            System.out.print("Enter Sales in month "+(i+1)+": ");
            month = sc.nextInt();
            Total_sales_Branch_3 += month;
       }
       System.out.println("***********************");
       Total_Sales = Total_sales_Branch_1 + Total_sales_Branch_2 + Total_sales_Branch_3;
       System.out.println("Total Sales In Branch A : "+Total_sales_Branch_1);
       System.out.println("Total Sales In Branch B : "+Total_sales_Branch_2);
       System.out.println("Total Sales In Branch C : "+Total_sales_Branch_3);
       System.out.println("Total Sales "+Total_Sales);
       System.out.println("***********************");
       if(Total_sales_Branch_1 > Total_sales_Branch_2 && Total_sales_Branch_1 > Total_sales_Branch_3)
       {
            System.out.println("Branch A have HIGHEST Sale !!!");
       }
       else if(Total_sales_Branch_2 > Total_sales_Branch_1 && Total_sales_Branch_2 > Total_sales_Branch_3)
       {
            System.out.println("Branch B have HIGHEST Sale !!!");
       }
       else
       {
        System.out.println("Branch C have HIGHEST Sale !!!");
       }
       System.out.println("***********************");




    }
    
}
