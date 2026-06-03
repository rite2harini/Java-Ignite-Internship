import java.util.Scanner;

public class EmployeeSalaryAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] salary = new int[5];
        int totalSalary = 0;

        System.out.println("Enter salaries of 5 employees:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i + 1) + " Salary: ");
            salary[i] = sc.nextInt();
            totalSalary += salary[i];
        }

        double averageSalary = (double) totalSalary / 5;

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);

        sc.close();
    }
}
