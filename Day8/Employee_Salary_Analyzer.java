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
package java_intership_day8;
import java.util.Scanner;
public class Employee_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] sal=new int [5];
		int i,sum=0;
		double avg;
		
		System.out.println("Enter the salary");
		for(i=0;i<5;i++) {
			sal[i]=sc.nextInt();
			sum=sum+sal[i];
		}
		avg = sum/5.0;
		System.out.printf("Total salary :%d\nAvg salary :%.2f\n",sum,avg);
		sc.close();
	}

}
