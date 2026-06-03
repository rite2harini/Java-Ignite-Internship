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
public class Employee_Salary_Analyzer 
{   public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double salary[] = new double[5];
    double total_salary=0;
    double average_salary=0;
    System.out.println("Enter Salary of 5 employees ");
    for(int i=0;i<5;i++)
    {
        System.out.print("Employee "+(i+1)+" Salary : ");
        salary[i]=sc.nextDouble();
        total_salary += salary[i];
    }
    
    System.out.println("Total Salary : "+total_salary);
    average_salary = (total_salary/5);
    System.out.println("Average Salary : "+average_salary);
}
}

