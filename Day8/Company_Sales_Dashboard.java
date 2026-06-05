import java.util.Scanner;
public class CompanySalesDashboard {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[][] sales = new int[3][4];
	        int overallSales = 0;
	        int highestSales = 0;
	        int topBranch = 0;

	        // Input sales data
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter sales for Branch " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Month " + (j + 1) + ": ");
	                sales[i][j] = sc.nextInt();
	            }
	        }

	        // Calculate totals
	        for (int i = 0; i < 3; i++) {
	            int branchTotal = 0;

	            for (int j = 0; j < 4; j++) {
	                branchTotal += sales[i][j];
	            }

	            System.out.println("Total Sales of Branch " + (i + 1) + ": " + branchTotal);

	            overallSales += branchTotal;

	            if (branchTotal > highestSales) {
	                highestSales = branchTotal;
	                topBranch = i + 1;
	            }
	        }

	        System.out.println("Overall Company Sales: " + overallSales);
	        System.out.println("Branch with Highest Sales: Branch " + topBranch);

	        sc.close();
	    }
}
