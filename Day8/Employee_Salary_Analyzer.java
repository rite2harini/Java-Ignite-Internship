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
import java.util.Scanner;

public class Employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter salaries of 5 employees:");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Total salary: Rs."+sum);
		System.out.println("Average salary: Rs."+(sum/5));
		
		sc.close();
	}

}
