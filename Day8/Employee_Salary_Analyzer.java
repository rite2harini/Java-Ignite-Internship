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
public class EmployeeSalaryAnalyzer {

    public static void main(String[] args) {

        int[] salary = {25000, 30000, 28000, 35000, 40000};

        int totalSalary = 0;

        for (int i = 0; i < 5; i++) {

            totalSalary = totalSalary + salary[i];
        }

        double averageSalary = totalSalary / 5.0;

        System.out.println("Total Salary: " + totalSalary);

        System.out.println("Average Salary: " + averageSalary);
    }
}
