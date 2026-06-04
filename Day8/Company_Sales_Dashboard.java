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
public class CompanySales {
    public static void main(String[] args) {
        double[][] sales = {
            {1500.0, 2000.0, 1800.5, 2200.0},
            {3000.0, 3100.0, 2900.0, 3500.0},
            {1200.0, 1150.0, 1300.5, 1400.0}
        };

        double overallSales = 0;
        double maxSales = -1;
        int bestBranch = -1;

        for (int i = 0; i < sales.length; i++) {
            double branchTotal = 0;
            
            for (int j = 0; j < sales[i].length; j++) {
                branchTotal += sales[i][j];
            }
            
            System.out.println("Branch " + (i + 1) + " Total Sales: " + branchTotal);
            
            overallSales += branchTotal;
            
            if (branchTotal > maxSales) {
                maxSales = branchTotal;
                bestBranch = i + 1;
            }
        }

        System.out.println("Overall Company Sales: " + overallSales);
        System.out.println("Branch with Highest Total Sales: Branch " + bestBranch);
    }
}
