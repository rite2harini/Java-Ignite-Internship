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

public class EmployeeSalaryAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[5];
        
        // Input salaries for 5 employees
        System.out.println("Enter salaries of 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i + 1) + ": ₹");
            salaries[i] = sc.nextDouble();
        }
        
        // Calculate total and average
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += salaries[i];
        }
        double average = total / 5;
        
        // Display results
        System.out.println("\n========== SALARY REPORT ==========");
        System.out.printf("Total Salary: \n",  + total);
        System.out.printf("Average Salary: \n", + average);
        
        sc.close();
    }
}
