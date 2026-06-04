
package JavaIgniteDay8;
import java.util.Scanner;
public class Employee_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] s=new int [5];
		int i,sum=0;
		double avg;

		System.out.println("Enter the salary");
		for(i=0;i<5;i++) {
			s[i]=sc.nextInt();
			sum=sum+sal[i];
		}
		avg = sum/5.0;
		System.out.printf("Total salary :%d\nAverage salary :%.2f\n",sum,avg);
		sc.close();
	}

}
