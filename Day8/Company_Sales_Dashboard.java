import java.util.Scanner;

public class CompanySalesDashboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] sales = new int[3][4];

        System.out.println("Enter sales data for 3 branches and 4 months:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Branch " + (i + 1) + ":");

            for (int j = 0; j < 4; j++) {
                System.out.print("Month " + (j + 1) + " Sales: ");
                sales[i][j] = sc.nextInt();
            }
        }

        int overallSales = 0;
        int highestSales = 0;
        int bestBranch = 0;

        for (int i = 0; i < 3; i++) {
            int branchTotal = 0;

            for (int j = 0; j < 4; j++) {
                branchTotal += sales[i][j];
            }

            System.out.println("Total Sales of Branch " + (i + 1) + ": " + branchTotal);

            overallSales += branchTotal;

            if (branchTotal > highestSales) {
                highestSales = branchTotal;
                bestBranch = i + 1;
            }
        }

        System.out.println("Overall Company Sales: " + overallSales);
        System.out.println("Branch with Highest Sales: Branch " + bestBranch);

        sc.close();
    }
}
