/*
Easy 2 – Employee Salary Analyzer

Create a program that:

Stores salaries of 5 employees in an array
Calculate and display:
Total Salary
Average Salary
Hint

Use a loop and a sum variable.
  */
package java_internship_assignment;
import java.util.Scanner;

public class employeesalaryanalyzer {
public static double totalsalary(int array[])
{	
	int i;
	double ts=0;
	for(i=0;i<5;i++)
	{	
		ts=ts+array[i];
	}
	return ts;
}
public static double avgsalary(double totalsalary)
{	
	return totalsalary/5;
}
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int i;
				double totalsalary;
				int[]employee=new int[5];
				for(i=0;i<5;i++)
				{	
					System.out.println("Enter the salary of 5 employees ");
					employee[i]=sc.nextInt();
					
				}
				totalsalary=totalsalary(employee);
				double avgsalary=avgsalary(totalsalary);
				System.out.println("Totalsalary="+totalsalary);
				System.out.println("Average salary="+avgsalary);
				
									

			}

		

	}

