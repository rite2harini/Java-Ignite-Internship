import java.util.Scanner;
public class EmployeeSalaryAnalyzer {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] salary = new int[5];
	        int total = 0;
	        double average;

	        System.out.println("Enter salaries of 5 employees:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Employee " + (i + 1) + ": ");
	            salary[i] = sc.nextInt();
	            total += salary[i];
	        }

	        average = (double) total / 5;

	        System.out.println("Total Salary: " + total);
	        System.out.println("Average Salary: " + average);

	        sc.close();
	    }
	}
