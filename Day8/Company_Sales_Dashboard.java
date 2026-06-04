
package JavaIgniteDay8;
import java.util.Scanner;
public class Company_sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]a = new int [3][4];
		int i,j,br=1;

		System.out.println("Enter the details :\n");
		for(i=0;i<3;i++) {
			System.out.println("For branch "+ br);
			for(j=0;j<4;j++) {
				a[i][j] = sc.nextInt();
			}
			br++;
		}
		System.out.println("The output :");
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
