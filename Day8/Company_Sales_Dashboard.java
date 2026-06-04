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

public class CompanySalesDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sales = new int[3][4];
        String[] branches = {"Branch 1", "Branch 2", "Branch 3"};
        String[] months = {"Jan", "Feb", "Mar", "Apr"};
        
        // Input sales data
        System.out.println("Enter sales data for 3 branches and 4 months:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + branches[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(months[j] + ": ");
                sales[i][j] = sc.nextInt();
            }
        }
        
        // Calculate totals
        int[] branchTotal = new int[3];
        int overallTotal = 0;
        int highestBranch = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                branchTotal[i] += sales[i][j];
            }
            overallTotal += branchTotal[i];
            if (branchTotal[i] > branchTotal[highestBranch]) {
                highestBranch = i;
            }
        }
        
        // Display report
        System.out.println("\n========== SALES DASHBOARD ==========");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s Total: ₹%d\n", branches[i], branchTotal[i]);
        }
        System.out.println("-----------------------------------");
        System.out.printf("Overall Company Sales: ₹%d\n", overallTotal);
        System.out.printf("Branch with Highest Sales: %s (₹%d)\n", 
                         branches[highestBranch], branchTotal[highestBranch]);
        
        sc.close();
    }
}
