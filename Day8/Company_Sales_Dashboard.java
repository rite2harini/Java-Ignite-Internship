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
public class CompanySalesDashboard {

    public static void main(String[] args) {

        int[][] sales = {
                {1200, 1500, 1800, 2000},
                {1000, 1400, 1700, 2100},
                {1300, 1600, 1900, 2200}
        };

        int overallSales = 0;
        int highestSales = 0;
        int bestBranch = 0;

        for (int i = 0; i < 3; i++) {

            int branchTotal = 0;

            for (int j = 0; j < 4; j++) {

                branchTotal = branchTotal + sales[i][j];
            }

            System.out.println("Total Sales of Branch " + (i + 1) + ": " + branchTotal);

            overallSales = overallSales + branchTotal;

            if (branchTotal > highestSales) {
                highestSales = branchTotal;
                bestBranch = i + 1;
            }
        }

        System.out.println("Overall Company Sales: " + overallSales);

        System.out.println("Branch with Highest Sales: Branch " + bestBranch);
    }
}
