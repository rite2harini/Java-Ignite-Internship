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
public class SalaryAnalyzer {
    public static void main(String[] args) {
        double[] salaries = {45000.0, 55000.0, 60000.0, 48000.0, 52000.0};
        double totalSalary = 0;

        for (int i = 0; i < salaries.length; i++) {
            totalSalary += salaries[i];
        }

        double averageSalary = totalSalary / salaries.length;

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
    }
}
